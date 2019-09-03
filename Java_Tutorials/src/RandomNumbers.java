
public class RandomNumbers {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 5); // here random method is returning double value so 
		                           //declare return variable with double datatype.    
		
		/*
		 * here if we need to declare this as int because we wanted system to display
		 * the value in double is float with many integers after .(decimal
		 *  
		 */
		System.out.println(num);

		
	}

}
