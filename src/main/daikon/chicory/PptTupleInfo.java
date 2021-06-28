package daikon.chicory;

import java.util.HashMap;
import java.util.Map;

/**
 * PpTupleInfo is a class that captures the following relative info of a program point state:
 *
 * - thisObj = this object present in the program point
 * - vars = map between variable names and values at that specific program point
 *
 * Note that variables are arguments or return variables of methods
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class PptTupleInfo {

  Object thisObj; // The this object from which the program point is being executed
  Map<String, Object> vars; // Map between variable names and values

  /**
   * Default constructor
   */
  public PptTupleInfo() {
    thisObj = null;
    vars = new HashMap<>();
  }

  /**
   * Constructor from an object
   */
  public PptTupleInfo(Object thisObj) {
    this.thisObj = thisObj;
    vars = new HashMap<>();
  }

  /**
   * Add the mapping between the given variable name and its value
   */
  public void addVarValue(String varName, Object value) {
    vars.put(varName, value);
  }

  /**
   * Get the this object
   */
  public Object getThisObject() {
    return thisObj;
  }

  /**
   * Get the value of the given variable name
   */
  public Object getVariableValue(String varName) {
    return vars.get(varName);
  }

  /**
   * Returns true if the tuple contains a value for the variable name
   */
  public boolean containsValue(String varName) {
    return vars.containsKey(varName);
  }

  /**
   * Return the total number of variables
   */
  public int totalVars() {
    return vars.size();
  }

}