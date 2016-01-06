import java.io.Console;

public class CaesarCipher {
  public static void main(String[] args) {

    askPhrase("Enter any phrase and see it with a Caesar Cipher encryption!");
  }

  public static void askPhrase(String prompt) {
    Console myConsole = System.console();
    System.out.println(prompt);
    String yourPhrase = myConsole.readLine();
    String caseControl = yourPhrase.toUpperCase();
    String caesarPhrase = caseControl.replaceAll("A", "N").replaceAll("B", "O").replaceAll("C", "P").replaceAll("D", "Q").replaceAll("E", "R").replaceAll("F", "S").replaceAll("G", "T").replaceAll("H", "U").replaceAll("I", "V").replaceAll("J", "W").replaceAll("K", "X").replaceAll("L", "Y").replaceAll("M", "Z").replaceAll("N", "A").replaceAll("O", "B").replaceAll("P", "C").replaceAll("Q", "D").replaceAll("R", "E").replaceAll("S", "F").replaceAll("T", "G").replaceAll("U", "H").replaceAll("V", "I").replaceAll("W", "J").replaceAll("X", "K").replaceAll("Y", "L").replaceAll("Z", "M");
    System.out.println("Here is your Caesar Cipher Encryption!: " + caesarPhrase);

  }
}
