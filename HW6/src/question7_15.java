
public class question7_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ARRAY_SIZE;
		try {
			//check if command-line argument is provided
			ARRAY_SIZE = args.length > 0 ? Integer.parseInt(args[0]):10;
			
		}catch(NumberFormatException e) {
			//handle if the argument is not valid integer
			System.out.println("Invalid input for array size, Using degfault size(10)");
			ARRAY_SIZE = 10;
		}
		
		
		
		//declare an array
		int[] array = new int[ARRAY_SIZE];
		
		//column heading
		System.out.printf("%s%8s%n", "Index", "Value");
		for(int counter=0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}

}
