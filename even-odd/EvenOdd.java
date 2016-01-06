import java.io.Console;

public class EvenOdd {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Give me a number, any number! I'll tell you which numbers from 0 to the number you enter are even or odd!");
    String stringNumber = console.readLine();
    Integer intNumber = Integer.parseInt(stringNumber);

    System.out.println("Here you go!");
    for ( Integer number = 0; number < intNumber; number++) {
      if ( number % 2 == 0 ) {
        System.out.println(number + " - even");
      } else {
        System.out.println(number + " - odd");
      }
    }
  }
}
