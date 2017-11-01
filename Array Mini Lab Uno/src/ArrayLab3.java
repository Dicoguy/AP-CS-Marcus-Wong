import java.util.Arrays;

public class ArrayLab3 {
	public static void main (String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7,14,21,28,35,42,49,56};
		int[] sumArr = sum(a1,a2);
		
		int appendNum = 200;
		int[] appendArr = appened(a1,appendNum);
		
		int removeIdx = 5;
		
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		for(int i = 0; i <= arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		return arr3;
	}
	public static int[] appened(int[] arr, int num) {
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0; i <= arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr2.length] = num;
		return arr2;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] returnArr = new int[arr.length - 1];
		for(int i = 0; i <= (idx - 1); i++) {
			
		}
	}
}
