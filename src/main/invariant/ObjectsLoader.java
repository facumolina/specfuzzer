package invariant;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.XStream;

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
  private static final String serialiazed_file_name = "/Users/fmolina/phd/software/fuzzing-specs/daikon-outputs/serializedobjects.xml";

  public static Object get_object(int hashcode) {
    if (objects == null)
      load_objects();
    return objects.get(hashcode);
  }

  private static void load_objects() {
    XStream xstream = new XStream();
    Object map_obj = new HashMap<Integer, Object>();
    try {
      ObjectInputStream ois = xstream
          .createObjectInputStream(new FileInputStream(serialiazed_file_name));
      try {
        while (true) {
          map_obj = ois.readObject();
        }
      } catch (EOFException e) {
        ois.close();
      }
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("Cannot deserialize file: " + serialiazed_file_name);
    }
    objects = (Map<Integer, Object>) map_obj;
    System.out.println("Loaded objects: " + objects.size());
  }
}
