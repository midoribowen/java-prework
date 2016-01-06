import java.io.Console;

public class Insurance {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What is your gender? (Male / Female)");
    String gender = console.readLine();

    System.out.println("How old are you?");
    String stringAge = console.readLine();
    Integer age = Integer.parseInt(stringAge);

    Boolean young = age <= 25;
    Boolean male = gender == "Male";

    if ( young && male ) {
      System.out.println("Your insurance is going to be really expensive!");
    } else if ( young || male ) {
      System.out.println("Your insurance is going to be pretty expensive!");
    } else {
      System.out.println("Your insurance is going to be expensive, but it could be worse.");
    }
  }
}
