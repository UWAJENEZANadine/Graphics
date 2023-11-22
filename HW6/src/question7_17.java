import java.util.Random;

public class question7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random number = new Random();
		int[] freq = new int[13]; //frequency of the sum index 2 to 12
		
		
		//rolling a dice 36000000 times
		for(int i=1; i< 36000000; i++) {
			try {
				//one die has 6 possible integer and the die to has 6 integer
				int die1 = 1 + number.nextInt(6);
				int die2 = 1 + number.nextInt(6);
				
				int sum = die1 + die2;
				
				//increment corresponding element in the array to totally the sum
				++freq[sum];
				
			}catch(Exception e) {
				System.out.println("During dice rolling error occured");
			}
			
		}
		System.out.printf("%s %s%n", "Sum", "   Frequency");
		
		for(int i = 2; i <freq.length; i++) {
			System.out.printf("%3d %11d%n", i,  freq[i]);
		}

	}

}
