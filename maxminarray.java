public class Main{
	public static void main(String[] args) {
		int[] numbers = {1,2,4,6,7,90,32,65,49,31};
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i = 1 ; i < numbers.length ; i++) {
			max =(numbers[i] > max) ? numbers[i] : max;
			min =(numbers[i] < min) ? numbers[i] : min;
		}
		
		System.out.println("Max = " +max+ " ; "+" Min = " +min);
	}
}
	