
import java.util.Scanner;
public class strictdivisors{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int i;
		System.out.println("enter a number");
		int n = input.nextInt();
		for(i=1; i<=n/2 ;i++ ) {
			if(n % i == 0) {
				
		        sum += i;
		        System.out.print(i +" ");
		        
			}
		}
		System.out.println(sum);
		input.close();
		
	}
}