
public class Preeti {
	
	public static void main(String[] args) {
		Preeti p = new Preeti(); // here 'p' is the reference variable for one of the oject of Preeti.
		System.out.println(p);
		
		new Preeti(); // here new object created for class Preeti does not have ref var.
		               // and such are elgible for garbage collection done by JVM.
		
		// Further if u assign 'p' variable to null then even that will be 
		 // eligible for garbage collection.  
		p= null;
		
	}

}
