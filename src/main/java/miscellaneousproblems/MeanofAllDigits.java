Create a function that returns the mean of all digits.
Notes
The mean of all digits is the sum of digits / how many digits there are (e.g. mean of digits in 512 is (5+1+2)/3(number of digits) = 8/3=2).
The mean will always be an integer.


public class Challenge {
	public static int mean(int a) {
		int result=0;
		int count =0;
		 int sum = 0; 
		while(a!=0){
			 sum = sum + a % 10; 
			 a /= 10;
			 count++;
		}
		 result=sum/count;
		return result;
	}
}
