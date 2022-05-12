public class Main{
	public static void main(String[] args) {
		int[][] integers = {{1,2,3,4},{2,3,4,6},{8,9,10,11}};
		
		for(int i = 0; i<3 ; i++) {
			int sum = 0;
			for(int j = 0 ; j<4 ; j++) {
				sum += integers[i][j];
					
			}
		    System.out.println("the sum of row "+(i+1)+"is "+sum);
		}
		System.out.println();
		for(int i = 0; i<4 ; i++) {
			int sum = 0;
			for(int j = 0 ; j<3 ; j++) {
				sum += integers[j][i];
					
			}
		    System.out.println("the sum of column "+(i+1)+"is "+sum);
		}
	}
}
	