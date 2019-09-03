package oops;

public class ActionMovies extends Movies {

	public ActionMovies() {
		super();
		System.out.println("Action Movies constructor:");
		
	}

	public ActionMovies(int movie_id, String[] actors) {
		super(movie_id, actors);
		System.out.println(super.getMovie_id());
	}

	public void release(){
		System.out.println("this is Action class method invoked");
	}
	
}
