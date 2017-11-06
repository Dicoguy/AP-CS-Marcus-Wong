//Marcus Wong
//11/3/17
//2nd Period
import java.util.Arrays;

public class ArrayLab3 {
	public static void main (String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7,14,21,28,35,42,49,56};
		int[] sumArr = sum(a1,a2);
		
		int appendNum = 200;
		int[] appendArr = appened(a1,appendNum);
	
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		
		int sumOfEvens = sumEven(appendArr);
		
		rotateRight(a1);
		
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		return arr3;
	}
	public static int[] appened(int[] arr, int num) {
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr2.length-1] = num;
		return arr2;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] returnArr = new int[arr.length - 1];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != idx) {
				returnArr[counter] = arr[i];
				counter++;
			}
		}
		return returnArr;
	}
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i += 2) {
			sum += arr[i];
		}
		return sum;
	}
	public static void rotateRight(int [] arr) {
		int[] rotated = new int[arr.length];
		int last = arr[arr.length-1];
		for(int i = rotated.length - 1; i >= 1; i--) {
			rotated[i] = arr[i-1];
		}
		rotated[0] = last;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rotated[i];
		}
	}
		
}
