package daikon.chicory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import com.google.gson.Gson;
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

  /** The HashMap mapping string to list of objects */
  /** Each key is a pair hashcode-pptName pointing to a list of objects */
  private static HashMap<String, List<Object>> objects = new HashMap<String, List<Object>>();

  private static String serialized_file_dir = System.getProperty("user.dir") + "/";

  public static String serialized_file_name;

  public static String curr_ppt_name;

  /**
   * Map the given hashcode with the given object
   */
  public static void addObject(int hashCode, Object object) {
    assert object != null : "The object to be saved should not be null";
    if (Chicory.daikon_args.contains(object.getClass().getSimpleName())) {
      String key = hashCode + "-" + curr_ppt_name;
      if (!objects.containsKey(key)) {
        objects.put(key, new LinkedList<Object>());
      }
      Gson gson = new Gson();
      objects.get(key).add(gson.fromJson(gson.toJson(object), object.getClass()));
    }
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

    // Write each object separately
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