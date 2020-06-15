package daikon.chicory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.thoughtworks.xstream.XStream;

/**
 * This class allows to maintain the collection of all created objects during Chicory execution.
 * Moreover, a map between hashcodes and the corresponding objects is used. This is a workaround to 
 * be able to retrieve objects based on the hashcode when running Daikon. 
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ObjectsCollector {

	/** The HashMap mapping hashcodes to objects */
	private static HashMap<Integer,Object> objects = new HashMap<Integer,Object>();

	private static final String serialiazed_file_name = "/Users/fmolina/phd/software/daikon-5.8.2/examples/java-examples/StackAr/serializedobjects.xml";

	/**
	 * Map the given hashcode with the given object
	 */
	public static void addObject(int hashCode, Object object) {
		assert object != null : "The object to be saved should not be null";
		System.out.println("Collecting object: "+hashCode);
		objects.put(hashCode,object);
		System.out.println("Total: "+objects.size());
	}

	/**
	 * Serialize the map between hashcodes and objects
	 */
	public static void serializeObjects() {
		System.out.println("Saving Objects - Total: "+objects.size());
		/*XStream xstream = new XStream();
		ObjectOutputStream oos;
		try {
			// Open the stream
			oos = xstream.createObjectOutputStream(new FileOutputStream(serialiazed_file_name));
		} catch (IOException e) {
			throw new Error("Cannot open serial file: " + serialiazed_file_name);
		}	
		
		// Write the objects map
		try {	
			oos.writeObject(objects);
		} catch (IOException e) {
			throw new Error("Cannot write objects to serial file: " + serialiazed_file_name);
		}
			
		// Close the stream
		try {
			oos.close();
		} catch (IOException e) {
			throw new Error("Cannot close serial file: " + serialiazed_file_name);
		}*/

	}

}