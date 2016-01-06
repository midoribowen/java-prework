public class GuestList {
  public static void main(String[] args) {
    String[] myGuestList = { "Tristan - Green beans", "Midori - Turkey & stuffing", "Teri - Roasted vegetables", "Mike - Mashed potatoes & gravy", "Sumiko - Whipped yams", "Dotty - Cranberry sauce", "Lara - Dessert", "Mahala - GF dessert", "Jeff - Salad" };

    System.out.println("Here is a list of everyone who is coming and what they are bringing:");

    for (Integer guest = 0 ; guest < myGuestList.length ; guest++) {
        System.out.println(myGuestList[guest]);
      }
  }
}
