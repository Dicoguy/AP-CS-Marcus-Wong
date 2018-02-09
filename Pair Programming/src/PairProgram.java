import java.util.*;
public class PairProgram {
	public static void main(String args []) {
		Scanner userInput = new Scanner(System.in);
		int sum = 0;
		int min = userInput.nextInt();
		int max = userInput.nextInt();
		boolean done = false;
		while(!done){
			int num = userInput.nextInt();
			min = num;
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
			if(num % 2 == 0) {
				sum += num;
			}
		}
	}
}