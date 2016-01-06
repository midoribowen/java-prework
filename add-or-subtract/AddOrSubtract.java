import java.io.Console;

public class AddOrSubtract {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Give me a number, any positive or negative number!");
    System.out.println("I'll add or subtract some numbers");
    String stringNumber = console.readLine();
    Integer integerNumber = Integer.parseInt(stringNumber);

    if ( integerNumber >= 0 ) {
      System.out.println("Looky, looky! This number is one more!:");
      System.out.println(integerNumber + 1);
    } else {
      System.out.println("Looky, looky! this number is one less!:");
      System.out.println(integerNumber - 1);
    }
  }
}
