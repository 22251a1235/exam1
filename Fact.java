public class Fact {
  public static long compute(long n) {
    long result = 1;
    for(int i=2;i<=n;i++) {
      result *= i;
    }
    return result;
  }
  public static void main(String args[]) {
    int num = 5;
    System.out.println("Factorial of" + num + "is: " + compute(num));
  }
}
