import java.io.Console;

public class WhatGrade {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What grade did you get in your last class? ('A', 'B', 'C', 'D', or 'F')");
    String grade = console.readLine();

    if ( grade.equals("A") || grade.equals("B") ) {
      System.out.println("Wow! Keep up the good work!");
    } else if ( grade.equals("C") ) {
      System.out.println("I know you can do better!");
    } else if (grade.equals("D") || grade.equals("F")) {
      System.out.println("You will have to work harder to pass your class next time!");
    } else {
      System.out.println("Invalid entry.");
    }
  }
}
