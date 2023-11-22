import java.util.InputMismatchException;
import java.util.Scanner;

public class question7_29c {
	public static double fibonacci(int nth) {
		double fibnumber;
		double previousNumber = 0.0;
		double currentNumber = 1.0;
		
		for(int i=0; i < nth; i++) {
			
			if(i<2) {
				fibnumber = i;
			}else {
				fibnumber =  previousNumber + currentNumber;
				previousNumber = currentNumber;
				currentNumber = fibnumber;
			}
		}
		return currentNumber;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
					
					long x =0;
					long y = 1;
					double largestFib = 0.0;
					
					while(true) {
						double num1 = x + y;
						if(num1 < 0) {
							break; //overflow occured
						}
						 largestFib = num1;
						 x = y;
						 y = (long)num1;
					}
					System.out.printf("The largest fibonacci: %.4f",  largestFib);
					
				
				}

}
