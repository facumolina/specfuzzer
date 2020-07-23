package daikon.chicory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.thoughtworks.xstream.XStream;

import daikon.Chicory;

/**
 * This class allows to maintain the collection of all created objects during Chicory execution.
 * Moreover, a map between hashcodes and the corresponding objects is used. This is a workaround to
 * be able to retrieve objects based on the hashcode when running Daikon.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ObjectsCollector {

  /** The HashMap mapping hashcodes to objects */
  private static HashMap<Integer, Object> objects = new HashMap<Integer, Object>();

  private static String serialized_file_dir = System.getProperty("user.dir") + "/";

  public static String serialized_file_name;

  /**
   * Map the given hashcode with the given object
   */
  public static void addObject(int hashCode, Object object) {
    assert object != null : "The object to be saved should not be null";
    objects.put(hashCode, object);
  }

  /**
   * Serialize the map between hashcodes and objects
   */
  public static void serializeObjects() {
    determine_file_name();
    System.out.println("Saving Objects - Total: " + objects.size());
    ObjectOutputStream oos = null;
    XStream xstream = new XStream();
    String serialized_to_file = serialized_file_dir + serialized_file_name;
    try {
      // Open the stream
      oos = xstream.createObjectOutputStream(new FileOutputStream(serialized_to_file));
    } catch (IOException e) {
      throw new Error("Cannot open serial file: " + serialized_to_file);
    }

    // Write the objects map
    try {
      oos.writeObject(objects);
    } catch (IOException e) {
      throw new Error("Cannot write objects to serial file: " + serialized_to_file);
    }

    // Close the stream
    try {
      oos.close();
    } catch (IOException e) {
      throw new Error("Cannot close serial file: " + serialized_to_file);
    }

  }

  /**
   * Determine objects file name before serializing
   */
  private static void determine_file_name() {
    if (Chicory.daikon_args == null) {
      // The file name was not specified
      serialized_file_name = "daikon-outputs/"
          + Chicory.dtrace_file.getName().replace(".dtrace.gz", "") + "-objects.xml";
    } else {
      serialized_file_name = Chicory.daikon_args;
    }
  }
}