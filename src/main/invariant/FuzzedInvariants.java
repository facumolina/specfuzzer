package invariant;

import daikon.PptSlice;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import daikon.inv.unary.scalar.SingleScalar;
import java.util.Map;
import java.util.HashMap;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import typequals.prototype.qual.Prototype;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.thoughtworks.xstream.XStream;

/**
 * Represents a set of invariants generating by fuzzing a grammar
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
//public class FuzzedInvariants extends SingleScalar {
public class FuzzedInvariants extends PointerInvariant {
  
  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization.  If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 20200610L;

  // Variables starting with dkconfig_ should only be set via the
  // daikon.config.Configuration interface.
  /** Boolean. True iff Positive invariants should be considered. */
  public static boolean dkconfig_enabled = Invariant.invariantEnabledDefault;

   
  /** The HashMap mapping hashcodes to objects */
  private Map<Integer,Object> objects;

  /** The file from which the hashmap must be loaded*/
  private static final String serialiazed_file_name = "/Users/fmolina/phd/software/daikon-5.8.2/examples/java-examples/StackAr/serializedobjects.xml";

  ///
  /// Required methods
  ///

  private FuzzedInvariants(PptSlice ppt) {
    super(ppt);
    System.out.println("FuzzedInvs builder from PptSlice");
    load_objects();
  }

  private @Prototype FuzzedInvariants() {
    super();
    System.out.println("FuzzedInvs default builder");
    load_objects();
  }

  private static @Prototype FuzzedInvariants proto = new @Prototype FuzzedInvariants();

  /** Returns the prototype invariant. */
  public static @Prototype FuzzedInvariants get_proto() {
    return proto;
  }

  /** Loads the hashmap containing the pairs hahdcode,objects */
  private void load_objects() {
    XStream xstream = new XStream();
    Object map_obj = new HashMap<Integer,Object>();
    try {
      ObjectInputStream ois = xstream.createObjectInputStream(new FileInputStream(serialiazed_file_name));
      try {
        while (true) {
          map_obj = ois.readObject();
          System.out.println("Reading object input stream, this should be made only once");
        }
      } catch (EOFException e) {
        /* The loop ends here */ }
      ois.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("Cannot deserialize file: " + serialiazed_file_name);
    }
    objects = (Map<Integer,Object>) map_obj;
    System.out.println("Loaded objects: "+objects.size());
  }

  /** returns whether or not this invariant is enabled */
  @Override
  public boolean enabled() {
    return dkconfig_enabled;
  }

  /** instantiate an invariant on the specified slice */
  @Override
  public FuzzedInvariants instantiate_dyn(@Prototype FuzzedInvariants this, PptSlice slice) {
    return new FuzzedInvariants(slice);
  }

  // A printed representation for user output
  @SideEffectFree
  @Override
  public String format_using(@GuardSatisfied FuzzedInvariants this, OutputFormat format) {
    return "FuzzedInvariants holds for: " + var().name();
  }

  @Override
  //public InvariantStatus check_modified(long v, int count) {
  public InvariantStatus check_modified(Object v, int count) {  
    //System.out.println(v == null? "is null":v.getClass().getSimpleName());
    //System.out.println(v == null? "":v.toString());
    //System.out.println("Hey! This is the FuzzedInvariants being evaluated");
    //if (v <= 0) {
    //  return InvariantStatus.FALSIFIED;
    //}
    return InvariantStatus.NO_CHANGE;
  }

  @Override
  //public InvariantStatus add_modified(long v, int count) {
  public InvariantStatus add_modified(Object v, int count) {  
    return check_modified(v, count);
  }

  @Override
  protected double computeConfidence() {
    // Assume that every variable has a .5 chance of being positive by
    // chance.  Then a set of n values have a have (.5)^n chance of all
    // being positive by chance.
    return 1 - Math.pow(.5, ppt.num_samples());
  }

  @Pure
  @Override
  public boolean isSameFormula(Invariant other) {
    assert other instanceof FuzzedInvariants;
    return true;
  }
}

