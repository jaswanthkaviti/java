import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,-1,-2,1,2,3,4,5,5,5,4,5,6,7,3};
		Scanner input = new Scanner(System.in);
		System.out.print("enter the element: ");
		int searchElement = input.nextInt();
		System.out.println(getNumberOcc(numbers , searchElement));
		
		
	}
	public static int getNumberOcc(int[] numbers, int searchElement) {
		int occ=0;
		for(int i=0;i<numbers.length;i++) {
			if(searchElement == numbers[i])
				occ++;
			
		}
		return occ;
		
	}

}
	