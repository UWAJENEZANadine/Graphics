import java.util.InputMismatchException;
import java.util.Scanner;

public class question7_29 {
	public static int fibonacci(int nth) {
		int fibnumber = 0;
		int previousNumber = 0;
		int currentNumver = 1;
		
		for(int i=0; i < nth; i++) {
			
			//Fibonacci of less than 2 is i
			if(i<2) {
				fibnumber = i;
			}else {
				fibnumber =  previousNumber + currentNumver;
				previousNumber = currentNumver;
				currentNumver = fibnumber;
			}
		}
		return fibnumber;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num=0;
		
		boolean realInput = false;
		while(!realInput ) {
			try {
				System.out.println("Please enter a  number to find finonacci");
				num = sc.nextInt();
				if (num < 0) {
					System.out.println("The fibonaccis must is defined for positive number");
					sc.nextLine();
				}else {
					System.out.printf("Fibonacci series %d = %d%n", num, fibonacci(num));
				break;
				
				
			}

				
				
			}catch(InputMismatchException e) {
		          System.out.println("Invalid input, try again enter an integer \n");
		          sc.nextLine(); //clear the buffer
				}
			
		    }

			
		
		
		

	}

}
