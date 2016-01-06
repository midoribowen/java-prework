public class FavoriteFoods {
  public static void main(String[] args) {
    String[] myFavoriteFoods = { "soup", "lasagne", "ramen", "salad", "curry", "sushi", "wakame salad", "sandwiches", "cheeseburgers", "bahn mi" };

    for (Integer foodItem = 0; foodItem < myFavoriteFoods.length; foodItem++) {
      if ( foodItem < 5 ) {
        System.out.println("I am eating " + myFavoriteFoods[foodItem] + ".");
      } else {
        System.out.println("I love " + myFavoriteFoods[foodItem] + ", but I'm full.");
      }
    }
  }
}
