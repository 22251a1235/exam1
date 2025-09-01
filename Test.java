public class Test {
  public static void main(String args[]) {
    try {
      if (Fact.compute(5)!=120) throws AssertionError("Test input failed for 5");
      if (Fact.compute(0)!=1) throws AssertionError("Test input failed for 0");
      System.out.println("All test cases passed");
    }
    catch(Exception e) {
      System.out.println("Exception arose " + e.getMessage());
    }
  }
}
