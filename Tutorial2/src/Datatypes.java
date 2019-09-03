
public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1234567890; // only 10digit numbers are accepted here
		long l=1234567890123456l; // accepts more range integers but need to 
        // mention "l" at the end
		
		float f= 1.256654545845f; // range it more but need to mention "f" 
		double d = 1.255454554875888888888888; //range is more than float. 
	
		
		boolean b; // when we mention here as datatype 'variable name' this is  
		           // called declaration
	//	double dd = 123648544545515154261454545; - this is called initialisation 
		// as we are assigning some value to the variable. 
		
		char c='s'; // accepts single character
		String s = "this is java tutorial" ; // accepts string
		Datatypes dt; // here you are creating object of class. also this is 
		              // non-primitive datatype as it is defined by programmer
		
		String s1="THIS IS TUTORIAL";
	
		//Concatenation of strings
		String s2 = "This ";
		String s3 = "is ";
		String s4 = "java tutorial";
		String s5 = s2+s3+s4;
		
		System.out.println(s5);
		System.out.println(s2+s3+s4);
		System.out.println(s3);
		System.out.println(s3+s4);
		System.out.println("this"+" is"+"java *****");
		System.out.println(2+7+"This"+s4);
		System.out.println("this"+2+3+"concat");//here integers were converted 
		          // into strings and then displayed.result was this23concat 
		System.out.println("this"+(2+3)+"concat");//bracket will be considered first
		
		
		/* 1+2 -> here 1 and 2 are operands and + is operator
		 * types of operator
		 * Unary operator - needs only one operand
		 * Binary operator - needs 2 operands
		 * Ternary operator -  needs 3 operands
		 * 
		 */
		
		System.out.println(32 <= 23); // it will display result stating true 
		 						// or false. here result will be false. as 32 is not 
								// less than 23
		
		
		
	}

}
