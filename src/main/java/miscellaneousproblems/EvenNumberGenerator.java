//Create a function that finds all even numbers from 1 to the given number.

public class Challenge {
	public static int[] findEvenNums(int num) {
		int [] result = new int[num/2];
		for(int i=2;i<=num;i=i+2){
			if(i%2==0){
				result[i/2-1]=i;
			}
		}
		return result;
	}
}
