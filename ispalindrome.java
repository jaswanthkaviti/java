import java.util.Scanner;
public class ispalindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the text:");
		String str = input.next();
		boolean ispalindrome = true;
		
		
		for(int i =0,j=str.length()-1; i<j ; i++,j--) 
		{
			if(str.charAt(i) == str.charAt(j))
				continue;
			
			ispalindrome = false;
			break;	
				
		}
		System.out.println(ispalindrome ? "palindrome" : "not palindrome");
		
		input.close();
	}
}