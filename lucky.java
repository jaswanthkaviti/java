import java.util.Scanner;
public class lucky{
	public static void main(String[] args) {
		System.out.println("enter a 4 digit number");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(!(n > 999)) {
			System.out.println(n + "is not a valid number");
		}
		else {
			int D = (n % 10);
			int C = (n / 10) % 10;
			int B = (n / 100) % 10;
			int A = (n / 1000) % 10;
			if(A + B == C + D) {
				System.out.println(n +" is a lucky numnber");
			
			}
			else {
				System.out.println(n +" is not a lucky number ");
			}
				
		}
		input.close();
		
		
	}
}