import java.util.Arrays;

//Marcus Wong
//10/30/17
public class LotsOfCopies {
	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4 , 5};
		System.out.println(num + " " + strMain + " " + Arrays.toString(arrMain));
		poop(num,strMain, arrMain);
		System.out.println(num + " " + strMain + " " + Arrays.toString(arrMain));
		
		int a = 1;
		int b = a;
		int c = 4;
		System.out.println(a);
		System.out.println(b);
		poop2(a);
		
		
	}
	public static void poop(int x, String word, int[] arr) {
		x++;
		word += "poop";
		arr[2] = 42;
		System.out.println(x + " " + word + " " + arr[2]);
	}
	public static void poop2(int num) {
		num++;
		System.out.println(num);
	}
}
