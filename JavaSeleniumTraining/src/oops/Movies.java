package oops;

import java.time.LocalDate;

import javax.xml.datatype.Duration;

public class Movies<date> {
static int count;
private	int movie_id;
String actors[];
LocalDate release_date;
Duration dur;
String movie_name;


public Movies() {
	System.out.println("i m in movies default constructor");
	count++;  // this logic is used to get the count of objects created
}

public Movies(int movie_id){
	this();
	System.out.println("I am under single parametere constructor");
}

public Movies(int movie_id, String[] actors) {
	this(654);
	this.actors = actors;
	System.out.println("I am under two parameters constructor");
}

public Movies(int movie_id, String[] actors, String movie_nm) {
	this(654);
	this.actors = actors;
	this.movie_name= movie_nm;
	System.out.println("I am in 3 parameters constructor");
}
public Movies(int movie_id, String[] actors, LocalDate release_date, String movie_name) {
	this.movie_id=movie_id;
	this.actors = actors;
	this.release_date = release_date;
	this.movie_name = movie_name;
	System.out.println("I am under 4 parameters constructor");
}
public String toString(){
	 return movie_id +","+movie_name+","+actors+","+release_date;
}

public int getMovie_id() {
	return movie_id;
}
public void setMovie_id(int movie_id) {
	this.movie_id = movie_id;
}
public String[] getActors() {
	return actors;
}
public void setActors(String[] actors) {
	this.actors = actors;
}
public LocalDate getRelease_date() {
	return this.release_date= LocalDate.now();
}
public void setRelease_date(LocalDate release_date) {
	this.release_date = release_date;
}
public Duration getDur() {
	return dur;
}
public void setDur(Duration dur) {
	this.dur = dur;
}
public String getMovie_name() {
	return movie_name;
}
public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}

public void release(){
	System.out.println("this is parent class method invoked");
}

}
