
public class LearningMethods {

	public static int a=1;
	public static int b=34;
	
	public static void print(){
		System.out.println("Learning Methods");
	}
	
	// here we have created functions with same name but different arguments.
	// this is called as "Function Overloading
	
	public static void addition(){
		
		int c = a+b;
		System.out.println("Addition is:"+c);
	}
	
	/*public static void addition(int r, int s){
		
		int add= r+s;
		System.out.println("Addition is:"+add);
	}
	*/
 public static int addition(int r, int s){
		
		int add= r+s;
		return add;
		
	}
	
 // Method for printing tables
 public static void tables(int t){
	 
	 for(int i=1; i<=10; i++){
		 
		 System.out.println(t*i);
	 }
 }
 
	public static void main(String[] args) {
		
		print();
		/*addition();
		int result = addition(32,32);
		System.out.println(result);*/
		
		tables(3);
		

	}

}
