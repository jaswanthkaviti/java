import java.util.Scanner;
    	public class Main {
		 public static void main(String[] args) {
			System.out.print("enter a number:");
			Scanner input = new Scanner(System.in);
			
			int n = input.nextInt();
			
			if( n % 2 == 0)
				System.out.println("even");
			if( n % 2 == 1)
				System.out.println("odd");
			
		}
	}

