package oops;

import java.time.LocalDate;
import java.util.Arrays;

import oops.Movies;

public class CallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Movies m=new Movies();
 m.release();
 
 Movies m_ovr_ride= new ActionMovies();
 m_ovr_ride.release();
 
// Movies m1= new Movies(987);
		String ar[]= {"john", "god"};
//Movies m2= new Movies(777, ar);
		
//Movies m3= new Movies(111, ar,"the film");
LocalDate dt= LocalDate.of(2019, 12, 21);
//Movies m4= new Movies(111,ar, dt, "the film");

/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
// =========Declaring array of objects
//Movies mv[]= new Movies[3]; // Here We have created an array of objects
//
//for(int i=1; i<=3; i++){
//	mv[i]= new Movies();      // HERE WE HAVE DEFINED THE ARRAY
//	
//}
//
//for(Movies m:mv){                 // HERE WE ARE ACCESSING THE ARRAY
//	System.out.println(m); 
//}
	
/*==============================*/
// Declaring array and assigning child class
//Movies mv[] = new Movies[2];
//mv[0]= new ActionMovies();
//mv[1]= new ComedyMovies();

/*===============================*/
// m.setMovie_id(13);
 //m.getRelease_date();
// System.out.println("Objects created are:" +m.count);
 //System.out.println("movie id is:"+ m.getRelease_date());
// m1.setMovie_id(122);
// System.out.println("movie id is:"+ m1.getMovie_id());

 //System.out.println(m4);
 //Movies am= new ActionMovies();
 
//System.out.println("Length:"+mv.length);

	}
}
