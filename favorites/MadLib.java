import java.io.Console;

public class MadLib {
  public static void main(String[] args) {
    Console myConsole =
    System.console();

    System.out.println("Enter a noun.");
    String noun = myConsole.readLine();
    System.out.println("Enter an adjective.");
    String adjective = myConsole.readLine();
    System.out.println("Enter a second noun.");
    String secondNoun = myConsole.readLine();
    System.out.println("One day a " + noun + " went to the park and ate a " + adjective + " " + secondNoun + ". The " + noun + " declared, 'This is the " + "most " + adjective + " " + secondNoun + " I ever tasted!'");
  }
}
