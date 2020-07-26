package fuzzer;

/**
 * Abstract class representing a Fuzzer.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public abstract class Fuzzer {

  /**
   * Returns an expression from the grammar.
   */
  public abstract String fuzz();

}
