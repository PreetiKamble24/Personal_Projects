package encapsulation;

public class DramaMovie extends Movie {
	static String act[]={"Shahid Kapoor","Kiara"};
	
	public DramaMovie() {
		
		super("Kabir Singh",act);
		//super.setMovie_actors(act);
		
		
		System.out.println("In drama movie const...");
	}
}
