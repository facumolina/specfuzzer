package invariant;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import daikon.Daikon;
import daikon.chicory.PptTupleInfo;
import daikon.tools.InvariantChecker;

/**
 * This class allows to load and maintain the collection of all created objects during Chicory
 * execution. This is from where FuzzedInvariants retrieves the objects from hashcodes in order to
 * evaluate the represented invariant.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public final class ObjectsLoader {

  /** The HashMap mapping hashcodes to objects */
  private static Map<String, List<PptTupleInfo>> objects;

  /** The file from which the hashmap must be loaded */
  private static final String serialiazed_file_dir = System.getProperty("user.dir") + "/";

  public static List<PptTupleInfo> get_object(String key) {
    if (objects == null) {
      load_objects();
      System.out.println("Total loaded objects: " + objects.size());
    }
    return objects.get(key);
  }

  private static void load_objects() {
    XStream xstream = new XStream();
    Object map_obj = new HashMap<Integer, Object>();

    String[] final_serialized_files = get_serialized_filenames();

    for (int i = 0; i < final_serialized_files.length; i++) {
      try {
        ObjectInputStream ois = xstream.createObjectInputStream(new FileInputStream(final_serialized_files[i]));
        try {
          while (true) {
            map_obj = ois.readObject();
          }
        } catch (EOFException e) {
          ois.close();
        }
      } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        throw new RuntimeException("Cannot deserialize file: " + final_serialized_files[i]);
      }
      if (objects == null)
        objects = (Map<String, List<PptTupleInfo>>) map_obj;
      else
        objects.putAll((Map<String, List<PptTupleInfo>>) map_obj);
      System.out.println("Loaded objects from file: " + final_serialized_files[i]);
    }
  }

  /**
   * Get the serialized file name
   */
  private static String[] get_serialized_filenames() {
    String supplied_files = null;
    if (Daikon.serialiazed_objects_file_name != null)
      supplied_files = Daikon.serialiazed_objects_file_name;
    if (InvariantChecker.serialiazed_objects_file_name != null)
      supplied_files = InvariantChecker.serialiazed_objects_file_name;
    if (supplied_files == null)
      throw new Daikon.UserError("Unable to get serialized_file_names");
    String[] splitted = supplied_files.split(";");
    String[] all_files = new String[splitted.length];
    for (int i = 0; i < all_files.length; i++) {
      all_files[i] = serialiazed_file_dir + splitted[i];
    }
    return all_files;
  }
}
