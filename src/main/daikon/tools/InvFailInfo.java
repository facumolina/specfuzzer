package daikon.tools;

/**
 * InvFailInfo is a custom class that represents some info that we want to preserve when an invariant fails
 * in the InvariantChecker. In particular, the invariant String representation and the program point name in
 * which the invariant failed.
 */
public class InvFailInfo {

  private String invString;
  private String pptName;

  public InvFailInfo(String inv, String pptName) {
    this.invString = inv;
    this.pptName = pptName;
  }

  public String getInvStr() { return invString; }

  public String getPptName() { return pptName; }

  @Override
  public String toString() {
    return invString + "-" + pptName;
  }

}