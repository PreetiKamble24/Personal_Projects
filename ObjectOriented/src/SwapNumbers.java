
public class SwapNumbers {

	/*=====================================
			
	// this is static function
	public static void first_method (){
		int a=1; //these is local variable to these funtion
		
		
	}
	// this is non static function
	public void second_method(){
		int b=2;
		
	}
	
	public static int s; // this is static global variable
	
	int t;	// this is non-static global variable
	
	==============================================================================*/
			
	
	int s;
	int t;
	
	public static void swap(int a, int b){ //this is pass by value method
		int temp = a;
		a=b;
		b= temp;
		 System.out.println("Pass by value of s is"+a);
		 System.out.println("Pass by value of t is"+b);

		
	}
	
	public static void swap( SwapNumbers p){
		int temp =p.s;
		p.s=p.t;
		p.t=temp;
		
		System.out.println("By reference"+p.s);
		System.out.println("by reference"+p.t);
	}
	
	public static void main(String[] args) {
		
		SwapNumbers sw = new SwapNumbers();
		 sw.s=12;
		 sw.t= 22;
		 swap( sw.s , sw.t);
		 System.out.println("Pass by value of s is"+sw.s);
		 System.out.println("Pass by value of t is"+sw.t);

		  // java does not supprt pass by value. only supports "Pass by reference"
		 swap(sw);
		 System.out.println("Pass By reference"+sw.s);
		 System.out.println("Pass by reference"+sw.t);
		 
	}

}
