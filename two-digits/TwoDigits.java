import java.io.Console;

public class TwoDigits {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Give me a number any number and I'll tell you if it has two digits or not!");
    String stringNumber = console.readLine();
    Integer integerNumber = Integer.parseInt(stringNumber);

    if ( (integerNumber >= 10 && integerNumber <= 99) || (integerNumber <= -10 & integerNumber >= -99) ) {
      String stringIfNumber = Integer.toString(integerNumber);
      System.out.println("Radical brah! " + stringIfNumber + "'s totally a double digit number!");
    } else {
      String stringElseNumber = Integer.toString(integerNumber);
      System.out.println("Nah brah, " + stringElseNumber + "'s not a double digit number.");
    }
  }
}
