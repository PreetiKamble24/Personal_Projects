package encapsulation;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Movie {
	
	private int movie_id;
	private String movie_name;
	private String movie_actors[];
	private LocalDate movie_releaseDate;
	private Duration movie_duration;
	
	public Movie() {
		System.out.println("m in default constructor()...");
	this.movie_id=101;
	}
	
	public Movie(String mname) {
		this();
		System.out.println("m in parameterised const()..");
		
		this.movie_name=mname;

	}
	
	public Movie(String mname,String actors[]) {
		this(mname);
		System.out.println("m in parameterised const()..");
		
		this.movie_actors=actors;

	}
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String[] getMovie_actors() {
		return movie_actors;
	}
	public void setMovie_actors(String[] movie_actors) {
		this.movie_actors = movie_actors;
	}
	public LocalDate getMovie_releaseDate() {
		return movie_releaseDate;
	}
	public void setMovie_releaseDate(LocalDate movie_releaseDate) {
		this.movie_releaseDate = movie_releaseDate;
	}
	public Duration getMopvie_duration() {
		return movie_duration;
	}
	public void setMopvie_duration(Duration mopvie_duration) {
		this.movie_duration = mopvie_duration;
	}
	
	
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + ", movie_actors="
				+ Arrays.toString(movie_actors) + ", movie_releaseDate=" + movie_releaseDate + ", movie_duration="
				+ movie_duration + "]";
	}

	public void toRealase(){
		this.setMovie_releaseDate(LocalDate.now());
		System.out.println("Movie Name: "+this.movie_name+" is getting relaesed on: "+this.movie_releaseDate);
	}
	
	public void movie_RunningDuration(){
		//.this.movie_duration=23;
	}
	
	
	

}
