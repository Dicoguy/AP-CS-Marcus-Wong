package poop;

public class test {
	public static void main(String args[]) {
		int[] array = {1,2,3,4};
		System.out.println(totalProdI(array));
		System.out.println(totalProdII(array));
		System.out.println(totalProdII(array));
	}
	public static int totalProdI(int[] arr) {
		int total = 1;
		for(int i = 0; i > arr.length; i++) {
			total *= arr[i];
		}
		return total;
	}
	
	public static int totalProdII(int[] arr) {
		int total = 1;
		for(int i = arr.length - 1; i > 0; i--) {
			total *= arr[i];
		}
		return total;
	}
	public static int totalProdIII(int[] arr) {
		int total = 1;
		int i = 0;
		while(i < arr.length) {
			total *= arr[i];
			i++;
		}
		return total;
	}
	
}
