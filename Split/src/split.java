//Marcus Wong
//10/28/17
//2nd Period
import java.util.*;
public class split {

	public static void main(String[] args) {
		//Part 0
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I HATE those dumb apples!".split(" ")));
		System.out.println(Arrays.toString("The cow exclaimed in a suprised tone MEOW".split(" ")));
		
		//Part 1
		String sandwich = "apples bread pineapples bread lettus bread tomato bacon bread mayo ham bread cheese";
		System.out.println(sandwichMiddle(sandwich));
		//Part 2
		String sandwich2 = "apples bread pineapples bread lettus bread tomato bacon bread mayo ham bread cheese";
		
	}
	public static String sandwichMiddle(String sandwich) {
		String[] toppings = new String[sandwich.split("bread").length];
		
		String middle = ""; 
		
		for (int i = 0; i < toppings.length; i++) {
			toppings[i] = sandwich.split("bread")[i];
		}
		
		for (int i = 1; i < toppings.length-1; i++) {
			middle += toppings[i];
		}

		return middle;
	}
}



