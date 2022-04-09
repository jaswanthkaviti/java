import java.util.Scanner;
public class sumexceeds100{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.print("enter a number:");
			sum += input.nextInt();
			
			if(sum >= 100)
				break;
			
		}
		System.out.println("Done");
		input.close();
		
	}
}