
public class question7_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double sum = 0.0;
		 
		 //looping the command-line argument using for
		 for(String arg : args) {
			 try {
				 sum += Double.parseDouble(arg);
			 }catch(NumberFormatException e) {
				 System.err.println("Invalid input" + arg);
			 }
			
		 }
		 System.out.printf("Sum is %.2f%n", sum);

	}

}
