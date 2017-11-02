//Marcus Wong
//10/30/17
//2nd Period
import java.util.Arrays;
public class LotsOfCopies {
	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4 , 5};
		//Before change
		System.out.println(num + " " + strMain + " " + Arrays.toString(arrMain));
		changeMe(num,strMain, arrMain);
		//After Change
		System.out.println(num + " " + strMain + " " + Arrays.toString(arrMain));
		//Array appears to be only one changed in the main method
		
		
		int a = 1;
		int b = a;
		int c = 4;
		//Before
		System.out.println(a + " " + b + " " + c);
		//change
		a++;
		//After a changes, but b stays the same
		System.out.println(a + " " + b + " " + c);
		
		
		String a2 = "one";
		String b2 = a2;
		String c2 = "three";
		
		//Before
		System.out.println(a2 + " " + b2 + " " + c2);
		//change
		a2 += "foot";
		//Yet b2 like b before adheres to the version of a before the change
		System.out.println(a2 + " " + b2 + " " + c2);
		
		int[] a3 = {3, 4, 5, 6};
		int[] b3 = a3;
		int[] c3 = {4, 5, 6, 7};
		//Before
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(b3));
		System.out.println(Arrays.toString(c3));
		//Change
		a3[3] = 42;
		//After
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(b3));
		System.out.println(Arrays.toString(c3));
		/* Arrays changing seem to apply on a broader scale, 
		   b3 adhered with a3, unlike Strings or ints
		*/
	}
	public static void changeMe(int x, String word, int[] arr) {
		x++;
		word += "foot";
		arr[2] = 42;
		System.out.println(x + " " + word + " " + arr[2]);
	}
}
	