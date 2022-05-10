import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("how many elements do you want to enter:");
		int n = input.nextInt();
		
		while( n > 20 || n < 0 ) {
			System.out.println("Invalid number , try again ");
			n = input.nextInt();
		}
		
		Point[] points = new Point[n];
		printarrayofpoints(points);
		printarrayofpoints(points);
		
	}
     private static void fillarrayofpoints(Point[] points) {
    	 Scanner input = new Scanner(System.in);
    	 for(int j = 0; j< points.length ; j++)
    		 System.out.println("enter x and y for point " + (j + 1) + " : ");
			  points[j] = new Point(input.nextInt() , input.nextInt());
	}

	private static void printarrayofpoints(Point[] points) {
		// TODO Auto-generated method stub
		System.out.print("the elements are:");
		for(int i = 0 ; i< points.length ; i++)
			System.out.println("(" + points[i].x + "," + points[i].y + ")");
		
	}

}
	