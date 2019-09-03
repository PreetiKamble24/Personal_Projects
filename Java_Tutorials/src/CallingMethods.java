
public class CallingMethods {

	public static void main(String[] args) {
		//CallingMethods c = new CallingMethods();
		go();

	/*
	 * Note:- static component cannot call non-static component directly.
	 * like without creating object C we cannot call methods in main method as those r nonstatic
	 * 
	 * Nonstatic --> allows non-static and static method calling **
	 *  
	 * Here we may even think why we not keep every method as static like main so that its
	 * convenient to call them. but if we do it it means we cannot follow OOPS concept.
	 */
		
	}

	public static void go()
	{
		System.out.println("called method go");
		//c.go1();
		
	}

	public void go1()
	{
		System.out.println("called method go1");
		
	}
	
}
