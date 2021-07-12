package gassert;

import java.util.HashSet;

/**
 * Class with basic static methods (based on class SimpleMethods from GAssert case studies)
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class BasicMethods {

  /**
   * Compute the minimum of two values
   *
   * @param a first value
   * @param b second value
   * @return a if a is lesser or equal to b, b otherwise
   */
  public int getMin(final int a, final int b) {
    final int result;
    if (a <= b) {
      result = a;
    } else {
      result = b;
    }
    assert (true);
    return result;
  }

  /**
   * Contains the ground truth for method getMin
   */
  private boolean getMin_groundTruth(int a, int b, int result) {
    return (a <= b && result==a) || (a > b && result==b);
  }

  /**
   * Absolute value.
   * @param x number from which absolute value is requested
   * @return abs(x)
   */
  public int abs(final int x) {
    final int i = x >>> 31;
    int result = (x ^ (~i + 1)) + i;
    assert (true);
    return result;
  }

  public double sum_doubles(double a, double b) {
    return a + b;
  }

  /** Add element to non-null set
   * @param intSet set of integers
   * @param element integer value to add to set
   */
  public void addElementToSet(HashSet<Integer> intSet, int element) {
    if (intSet != null) {
      intSet.add(element);
    }
    assert (true);
  }

  /** Increment the value of element in a non-null array at a given index
   * @param intArray array of integers
   * @param ind index at which the element will be incremented
   */
  public void incrementNumberAtIndex(int[] intArray, int ind) {
    if (intArray != null && (ind >= 0 && ind < intArray.length)) {
      intArray[ind] = intArray[ind] + 1;
    }
    assert (true);
  }

}
