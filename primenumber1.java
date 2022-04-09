
import java.util.Scanner;
public class strictdivisors{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("enter a number");
		int n = input.nextInt();
		for(i=2; i<n ;i++ ) {
			if(n % i == 0) {
	         System.out.print(n + "is not a prime number");
			}
			
		}
		System.out.println(n +"is a prime number");
		
		input.close();
		
	}
}