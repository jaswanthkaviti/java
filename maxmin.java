import java.util.Scanner;
public class maxmin{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		int max = n;
		int min = n;
		
		while(true) {
		
			n = input.nextInt();
			
			if(n<0)
				break;
			if(n>max)
				max = n;
			if(n<min)
				min =n;
		}
		input.close();
		
		System.out.println("max is " + max +" min is " + min);
	}
}