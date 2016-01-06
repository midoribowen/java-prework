import java.io.Console;

public class Potluck {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Hey! We're going to have a potluck! Type in your name to see what we'd like you to bring: ");
    String stringName = console.readLine();
    String firstLetter = stringName.substring(0, 1);
    String alpha = "A";
    Integer potluckPick = firstLetter.compareTo(alpha);

    if ( (potluckPick == 0) || (potluckPick == 5) || (potluckPick == 10) || (potluckPick == 15) || (potluckPick == 20) ) {
      System.out.println("Great, " + stringName + "! Could you bring a salad?");
    } else if ( (potluckPick == 1) || (potluckPick == 6) || (potluckPick == 11) || (potluckPick == 16) || (potluckPick == 21) ) {
      System.out.println("Great, " + stringName + "! Could you bring an appetizer?");
    } else if ( (potluckPick == 2) || (potluckPick == 7) || (potluckPick == 12) || (potluckPick == 17) || (potluckPick == 22) ) {
      System.out.println("Great, " + stringName + "! Could you bring an entree?");
    } else if ( (potluckPick == 3) || (potluckPick == 8) || (potluckPick == 13) || (potluckPick == 18) || (potluckPick == 23) || (potluckPick == 25)) {
      System.out.println("Great, " + stringName + "! Could you bring a side dish?");
    } else if ( (potluckPick == 4) || (potluckPick == 9) || (potluckPick == 14) || (potluckPick == 19) || (potluckPick == 24) ) {
      System.out.println("Great, " + stringName + "! Could you bring a dessert?");
    } else {
      System.out.println("Just bring yourself, you since you are anonymous!");
    }
  }
}
