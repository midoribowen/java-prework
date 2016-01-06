import java.io.Console;

public class ShippingCost {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is your package weight (ounces)?");
    String stringOunces = myConsole.readLine();

    System.out.println("How many miles are you sending your package?");
    String stringMiles = myConsole.readLine();

    Integer packageWeight = Integer.parseInt(stringOunces);
    Integer packageDistance = Integer.parseInt(stringMiles);
    Integer cost = ( packageWeight / 10 ) + ( packageDistance / 5 ) * 2;

    String stringCost = Integer.toString(cost);
    System.out.println("Your package will cost about: $" + stringCost + ".00");
  }

}
