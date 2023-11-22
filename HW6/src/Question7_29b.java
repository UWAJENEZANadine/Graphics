
public class Question7_29b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration
		long x =0;
		long y = 1;
		long largestFib = 0;
		
		while(true) {
			long num = x + y;
			if(num < 0) {
				break; //overflow occured
			}
			 largestFib = num;
			 x = y;
			 y = num;
		}
		System.out.printf("The largest fibonacci: %d",  largestFib);

	}

}
