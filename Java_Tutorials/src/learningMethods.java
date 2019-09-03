
public class learningMethods {
 
	int i; //here we are doing declaration and initialisating variable by i=9
	public void display() // methods are declared this way only. and methods are defined.
	{                 // public is called access modifier and void is return type.
	// void or any other datatype will define what datatype method is going to return
	
		/* 
		 * if return type is mentioned we have to mention keyword "return" in the body
		 *  with the same datatype. return should be last statement of the method
		 */
		
		// if this method body is empty that means we have not yet defined the method.
	}
	
	public void show (int i, String s, char c, boolean b)
	{
		
	}
	
	public static void main(String[] args) {
		/*learningMethods l = new learningMethods (); // you should always create such
		 								// object of the main class and then call methods 
		
		l.show(2, strlearning, P, false);
		l.display();
		*/

		 /* LearningVariable v = new LearningVariable(); // v-> obj- i=10
			   v.i++; // increaments to 11
			  
			  LearningVariable v1 = new LearningVariable(); ///  v1-> obj- i=10
			  v1.i=23; // assigns i=23
			  
			  LearningVariable v2 = new LearningVariable(); // v2-> obj- i=10
			 System.out.println(v2.i);  // i holds 10 thus displayed 10
		*/
	
		Calculator calc = new Calculator();
		int r = calc.add(3, 2);  // here num1 and num2 are called arguments. what we pass in menthods
		               // are called arguments and what we define are called parameters
		System.out.println("Addition is" +r);
		System.out.println("Division of " + calc.div(15, 3));
		
		/*
		 * Calling inbuild method random. we are assinging it to int so that method would return
		 * int value instead of double. and multiplying with 20 so that system would 
		 * return values in between 1-20.	
		 * int num= (int)(Math.random()*20);
		System.out.println("Num = ");
		 */
	}

}
