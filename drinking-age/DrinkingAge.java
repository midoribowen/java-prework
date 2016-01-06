import java.io.Console;

public class DrinkingAge {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Can I see your ID before you buy this alcohol?");
    String stringUserAge = console.readLine();
    Integer integerUserAge = Integer.parseInt(stringUserAge);

    if ( integerUserAge >= 21 ) {
      System.out.println("Yay! Drink up! (Safely...)");
    } else if ( integerUserAge < 21 ) {
      System.out.println("Aw, shucks, you are too young to drink today. Please leave this site/store/bar.");
    } else {
      System.out.println("You must enter a number to continue.");
    }
  }
}
