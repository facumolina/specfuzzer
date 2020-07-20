package fuzzer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * This class represents a Fuzzer. Currently, this implementation is only used to communicate with a
 * Python fuzzer.
 * 
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class Fuzzer {

  private static final String fuzzer_script = System.getProperty("user.dir") + "/FuzzSpecs.py";

  /**
   * Returns an expression of the given grammar produced with the Python fuzzer.
   */
  public static String fuzz(String grammar_file) {
    try {
      Process p = Runtime.getRuntime()
          .exec(new String[] { "python", fuzzer_script, grammar_file, Integer.toString(1) });
      p.waitFor();
      OutputStream os = p.getOutputStream();

      BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
      return br.readLine();

    } catch (Exception e) {
      throw new IllegalArgumentException(
          "Unable to run script FuzzSpecs.py for grammar " + grammar_file);
    }
  }

  public static void main(String[] args) {
    if (args.length != 1) {
      throw new IllegalArgumentException("Only the fully grammar file name is expected");
    }

    // Get the class
    String grammar_file = args[0];
    System.out.println(fuzz(grammar_file));
  }
}
