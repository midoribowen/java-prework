import java.io.Console;

public class Calculator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Hi, I'm a calculator! I will show you the sum, difference, product, and quotient of any two numbers!");

    System.out.println("Give me a number!");
    String stringNumberOne = myConsole.readLine();

    System.out.println("Give me a second number!");
    String stringNumberTwo = myConsole.readLine();

    Double numberOne = Double.parseDouble(stringNumberOne);
    Double numberTwo = Double.parseDouble(stringNumberTwo);
    Double yourSum = numberOne + numberTwo;
    Double differenceOne = numberOne - numberTwo;
    Double differenceTwo = numberTwo - numberOne;
    Double yourProduct = numberOne * numberTwo;
    Double quotientOne = numberOne / numberTwo;
    Double quotientTwo = numberTwo / numberOne;

    String stringSum = Double.toString(yourSum);
    System.out.println("Here is the sum of your two numbers: " + stringSum + "!");

    String stringDifferenceOne = Double.toString(differenceOne);
    System.out.println("Here is one difference of your two numbers: " + stringDifferenceOne + "!");

    String stringDifferenceTwo = Double.toString(differenceTwo);
    System.out.println("Here is the other difference of your two numbers: " + stringDifferenceTwo + "!");

    String stringProduct = Double.toString(yourProduct);
    System.out.println("Here is the product of your two numbers: " + stringProduct + "!");

    String stringQuotientOne = Double.toString(quotientOne);
    System.out.println("Here is one quotient of your two numbers: " + stringQuotientOne + "!");

    String stringQuotientTwo = Double.toString(quotientTwo);
    System.out.println("Here is the other quotient of your two numbers: " + stringQuotientTwo + "!");
  }
}
