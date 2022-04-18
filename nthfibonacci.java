import java.util.Scanner;
public class nthfibonacci{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a positive integer : ");
		int n = input.nextInt();
		int result = 0;
		int v1 = 1;
		int v2 = 1;
		
		
		for(int i = 1; i<=n-2 ; i++) {
			result = v1 + v2;
		    v1 = v2;
		    v2 = result;
		}
		    
	
	 System.out.println("the "+n+"th fabonacci number is :" +result);
		    
		input.close();
	}
}