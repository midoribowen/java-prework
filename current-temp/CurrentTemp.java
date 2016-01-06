import java.io.Console;

public class CurrentTemp {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What is the current temperature?");
    String stringTemperature = console.readLine();
    Integer temperature = Integer.parseInt(stringTemperature);

    Boolean death = temperature < -40;
    Boolean frigid = (temperature >= -40) && (temperature <= 15);
    Boolean cold = (temperature > 15) && (temperature <= 32);
    Boolean chilly = (temperature > 32) && (temperature < 55);
    Boolean cool = (temperature >= 55) && (temperature < 65);
    Boolean warm = (temperature >= 65) && (temperature < 75);
    Boolean hot = (temperature >= 75) && (temperature < 85);
    Boolean hotter = (temperature >= 85) && (temperature < 95);
    Boolean scorching = (temperature >= 95) && (temperature < 105);
    Boolean hottest = temperature >= 105;

    if ( death ) {
      System.out.println("Don't go outside. Probably wear layers inside. Insulate your windows. Have a consistent heat source inside. Settle in.");
    } else if ( frigid ) {
      System.out.println("Do not go outside without wearing a warm jacket, long underwear, a wool sweater, pants over your long underwear, wool socks, insulated winter boots, a hat, a scarf, and gloves or mittens. It is so cold, you could easily die if you do not have the right cloths on.");
    } else if ( cold ) {
      System.out.println("It's cold out, wear a warm jacket. Long underwear under your pants and a sweater should keep you warm. Also, wear a hat, scarf, and gloves or mittens. You'll probably need boots too, because it's cold enough for water to freeze.");
    } else if ( chilly ) {
      System.out.println("It's pretty chilly out, you should wear a jacket, long sleeves, and pants. If you're going to be outside for a long period of time, you should wear long underwear too. A hat, scarf, and gloves or mittens will keep your heat in better.");
    } else if ( cool ) {
      System.out.println("It's cool out, so you should wear long sleeves. You might need a jacket in the evening. Pants are a good option. If you wear a skirt, it's a good idea to wear leggings or tights underneath. A scarf will keep you cozy and add a cute accessory.");
    } else if ( warm ) {
      System.out.println("It's warm, you can comfortably wear a t-shirt or short-sleeved blouse and pants and not be too cold or too warm. You can probably wear shorts or a skirt with no leggings or tights and be comfortable. You may want a light jacket at night.");
    } else if ( hot ) {
      System.out.println("Whew, it's getting hot outside! Short sleeves, dresses, shorts, skirts, and sandals are the way to keep cool. Make sure to wear sunblock too, to protect your skin.");
    } else if ( hotter ) {
      System.out.println("Wow, it's hot! At this point, you might want to just wear loose-fitting clothes, to allow air to cool your skin. Anything made of relatively thin cotton will be good. Drink plenty of water");
    } else if ( scorching ) {
      System.out.println("It's so hot. Wear loose-fitting clothing, made from breathable fabrics. Sandals are good, to protect your feet from the hot ground. Drink lots of water.");
    } else if ( hottest ) {
      System.out.println("Probably don't go outside. If you do, wear loose-fitting clothing, made from breathable fabrics. Sandals are good, to protect your feet from molten lava. Drink lots of water, or better yet, don't wear clothes and sit in a cool tub of water all of the time.");
    } else {
      System.out.println("Please input a valid temperature.");
    }
  }
}
