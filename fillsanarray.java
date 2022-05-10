import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("how many elements do you want to enter:");
		int n = input.nextInt();
		
		while( n > 20 || n < 0 ) {
			System.out.println("Invalid number , try again ");
			n = input.nextInt();
		}
		
		int[] numbers = new int[n];
		fillarrayofintegers(numbers);
		printarrayofintegers(numbers);
		
	}
     private static void fillarrayofintegers(int[] numbers) {
    	 Scanner input = new Scanner(System.in);
    	 for(int i = 0; i< numbers.length ; i++)
    		 numbers[i] = input.nextInt();
	}

	private static void printarrayofintegers(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.print("the elements are:");
		System.out.println(Arrays.toString(numbers));
		
	}

}
	