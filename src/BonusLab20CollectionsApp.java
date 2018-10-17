import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class BonusLab20CollectionsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String userKnowMore = "no";
		//String continueShopping = "no";
		
		//list to keep track of items bought
		List<String> list = new ArrayList<>();
		List<Double> prices = new ArrayList<>();
		
		
		Enumeration<String> price;
		String items;
		
		//menu of items
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("Apple", "$0.99");
		hashtable.put("Banana", "$0.59");
		hashtable.put("Cauliflower", "$1.59");
		hashtable.put("Dragonfruit", "$2.19");
		hashtable.put("Strawberry", "$0.79");
		hashtable.put("Grapefruit", "$1.99");
		hashtable.put("Watermelon", "$2.09");
		hashtable.put("Honeydew", "$3.49");
		
		
		
		price = hashtable.keys();
		
		//printing out the menu
		
		System.out.println("Welcome to Guenther's Market!");
		System.out.println();
		
		  String header = "Item  "  + "      Price  " + "\n"
                  +   "==================   ";
      System.out.println(header);
		
		 while(price.hasMoreElements()) {
		 items = (String) price.nextElement();
		
	      System.out.println(items + "  " + hashtable.get(items));


		 }
		 
		do { 
		//while(continueShopping.equals("yes")) {
		System.out.println();
		System.out.println("What would you like to order?");
		String order = sc.next();
		 //if(hashtable.get(order) == null) {
			// System.out.println("Sorry we don't have those.");
		 //}else {
		//System.out.println("Continue Shopping? (yes/no)");
		//continueShopping = sc.next();
		
		
		//}
		
		//adding order to list of total order
		list.add(order);
		
		System.out.println("Adding " + order + " to cart at " + hashtable.get(order) );

		System.out.println("Would you like to order anything else? (yes/no)");
		userKnowMore = sc.next();
		 //}
		
		
		}while(userKnowMore.equals("yes"));
		
		System.out.println("Thanks for you order!");
		System.out.println("Here's what you got: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int i = 0; i < prices.size(); i++) {
			System.out.println(prices.get(i));
		}
		
	
		sc.close();
		


	}

}
