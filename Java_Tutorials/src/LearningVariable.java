
public class LearningVariable {

	
	/* 3 types of variables
	 * instance or global - anything declared under the class body 
	 * local - anything declared under the method body
	 * 
	 * 
	 */
	int i=10; // instance / global variable
	
	public void show(){
		int t; // local variable
		i = 1344;  // since global can be used anywhere in the class or even in other method
		
		/* 
		 * we can even call this variable in other class. for that first we have to declare
		 * object of this class in that class and then call this variable there.
		 *  eg- go to learningMethods class and 
		 *  LearningVariable v = new LearningVariable();
		 *  v.i++;
		 *  
		 *  LearningVariable v1 = new LearningVariable();
		 *  v1.i=23
		 *  
		 *  LearningVariable v2 = new LearningVariable();
		 *  System.out.println(v2.i);
		 * 
		 */ 
		
		
	}
	
}
