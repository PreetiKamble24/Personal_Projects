package encapsulation;

public class ActionMovie extends Movie {

	public ActionMovie() {
		super("ActionReplay");
		System.out.println("In action movie const...");
	}
	
	public void toRealase(){
		System.out.println("Released: "+this.getMovie_name());
	}
	
}
