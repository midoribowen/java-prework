import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a number, any number, and I'll ping-pong it for you!");
    String stringPingPong = console.readLine();
    Integer pingPong = Integer.parseInt(stringPingPong);

    System.out.println("Check out your ping-ponged number!");
    for ( Integer i = 1 ; i < pingPong ; i++ ) {
      if ( i % 15 == 0 ) {
        System.out.println("pingPONG!");
      } else if ( i % 3 == 0 ) {
        System.out.println("ping!");
      } else if ( i % 5 == 0) {
        System.out.println("PONG!");
      } else {
        System.out.println(i);
      }
    }
  }
}
