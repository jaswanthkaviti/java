public class Main{
	public static void main(String[] args) {
		int[][] integers = {{1,2,3,4},{2,3,4,6},{8,9,10,11}};
		
		for(int i = 0; i<3 ; i++) {
			int max = integers[i][0];
			for(int j = 0 ; j<4 ; j++) {
				max = (integers[i][j] > max ) ? integers[i][j] : max;
					
		     }
		    System.out.println("the max element of row "+(i+1)+"is "+max);
		}
	}
}
	