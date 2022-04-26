import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		System.out.print("enter your name and age ");
		System.out.print(getName() + "is" + getAge());
}
	public static String getName() {
		return new Scanner(System.in).nextLine();
	}
	public static int getAge() {
		return new Scanner(System.in).nextInt();
	}
	
}
	