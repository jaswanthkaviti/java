import java.util.Scanner;
public class spaces{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the text:");
		String str = input.next();
		
		for(int i = 0 ; i<= str.length() - 1;i++) {
		  
			System.out.print(str.charAt(i) + " ");
		}
		
		input.close();
	}
}