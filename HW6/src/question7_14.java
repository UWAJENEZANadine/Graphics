import java.util.*;

public class question7_14 {
	
	//defines a method that calculate the product of a series of integer
	//using variable length argument-list.
	public static int product(int... num) {
		if(num.length == 0) {
			return 0;
		}
			
			int total = 1;
			for(int a: num) {
				total *= a;
			}
			return total;
			
		
	}

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		boolean validInter = false;
		while(!validInter) {
			try {
				System.out.println("please enter a number to find its product");
				
				if(input.hasNextInt()) {
					
				
				//reading input from the user
				int num = input.nextInt();
				System.out.printf("The First product: %d\n",product());
				System.out.printf("The Second product: %d\n",product(num));
				System.out.printf("The Third product: %d\n",product(num , num));
				System.out.printf("The Fourth product: %d\n",product(num , num , num));
				System.out.printf("The Firth product: %d\n",product(num , num , num , num));
				System.out.printf("The Sixth product: %d\n",product(num , num , num , num,num));
				validInter = true; //valid input received, exit the loop
				}else {
					System.out.println("The input must be an integer. Try again\n");
					input.next();
					
				}
				//catching error if input is not integer
				}catch(InputMismatchException e) {
				System.out.println("The input must be an integer. try again");
				input.next();
				int num1 = input.nextInt();
			}catch(Exception e) {
				System.out.printf("an error occured:", e.getMessage());
			}
			
		}
		
		
	}

}
