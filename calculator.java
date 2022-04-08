import java.util.Scanner;
public class calculator{
	public static void main(String[] args) {
		System.out.println("enter the values");
		Scanner input = new Scanner(System.in);
		double d1 = input.nextDouble();
		char op = input.next().charAt(0);
		double d2 = input.nextDouble();
		//if starts
		
		if(op == '+')
			System.out.println(d1 + d2);
		else if(op == '-')
			System.out.println(d1 - d2);
		else if(op == '*')
			System.out.println(d1 * d2);
		else if(op == '/')
			System.out.println(d1 / d2);
		else if(op == '%')
			System.out.println(d1 % d2);
		input.close();
	}
}
