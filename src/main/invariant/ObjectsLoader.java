package invariant;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.XStream;

import daikon.Daikon;
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
  private static Map<Integer, Object> objects;

  /** The file from which the hashmap must be loaded */
  private static final String serialiazed_file_dir = System.getProperty("user.dir")
      + "/daikon-outputs/";

  public static Object get_object(int hashcode) {
    if (objects == null)
      load_objects();
    return objects.get(hashcode);
  }

  private static void load_objects() {
    XStream xstream = new XStream();
    Object map_obj = new HashMap<Integer, Object>();

    String serialized_file_name = get_serialized_filename();

    try {
      ObjectInputStream ois = xstream
          .createObjectInputStream(new FileInputStream(serialized_file_name));
      try {
        while (true) {
          map_obj = ois.readObject();
        }
      } catch (EOFException e) {
        ois.close();
      }
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("Cannot deserialize file: " + serialized_file_name);
    }
    objects = (Map<Integer, Object>) map_obj;
    System.out.println("Loaded objects: " + objects.size());
  }

  /**
   * Get the serialized file name
   */
  private static String get_serialized_filename() {
    if (Daikon.inv_file != null)
      return serialiazed_file_dir + Daikon.inv_file.getName().replace(".inv.gz", "-objects.xml");
    if (InvariantChecker.invariant_file != null)
      return serialiazed_file_dir
          + InvariantChecker.invariant_file.getName().replace(".inv.gz", "-objects.xml");

    throw new Daikon.UserError("Unable to get serialized_file_name");
  }
}
