import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import abstractintf.BatteryTorch;
import abstractintf.Circle;
import abstractintf.Operations;
import abstractintf.Shape;
import collections.ListDemo;
import collections.MapDemo;
import collections.SetDemo;
import encapsulation.ActionMovie;
import encapsulation.DramaMovie;
import encapsulation.Movie;
import encapsulation.StaicDemo;
import exceptionHandling.AcceptAge;
import exceptionHandling.AgeInvalidException;
import exceptionHandling.Artihmetic;
import iodemos.ReadWriteFile;
import iodemos.ReadWriteProperties;
import misc.Address;
import misc.Employee;

public class Test {
public static void main(String[] args) throws IOException {
	/*String names[]={"John","Samuel"};
	Movie july_m=new Movie("Angry Birds",names);
	System.out.println(july_m.getMovie_id()+" "+july_m.getMovie_name());
	july_m.toRealase();
	System.out.println(july_m.getMovie_actors()[0]);
	System.out.println(july_m);*/
/*	
	StaicDemo obj1=new StaicDemo();
	//obj1.setCount(3);
	obj1.setMycount(3);
	StaicDemo obj2=new StaicDemo();
	System.out.println(obj2.getCount());
	System.out.println(obj2.getMycount());*/
	
	/*Movie movies[]=new Movie[4];
	
	movies[0]=new ActionMovie();
	movies[1]=new ActionMovie();
	movies[2]=new DramaMovie();

	System.out.println(movies[1]);
	movies[1].toRealase();
	movies[2].toRealase();*/
	/*for(Movie m:movies)
		System.out.println(m);*/
	
	//System.out.println("Lenght: "+movies.length);
	
	/*Shape s=new Circle(23);
	System.out.println("Area of circle is: "+s.findArea());
	s.implementedMethod();*/
	
	/*
	
	
	
	
	
	BatteryTorch op=new BatteryTorch();
	op.off();
	op.on();
	System.out.println("Status of on.."+op.getStatus());
	*/

	
	/*Artihmetic myObj=new Artihmetic();
	int a[]={1,5,7};
	
	System.out.println("Addition is: "+myObj.add(a));
	
	
	try(FileReader f=new FileReader("file.txt");FileWriter fw=new FileWriter("f1.txt")){
		int ch=0;
		ch=f.read();
		while(ch!=-1){
			System.out.println(ch);
			ch=f.read();}
	}catch(Exception e){
		System.out.println(e);
	}
	*/
	
	
	/*try(AcceptAge ap=new AcceptAge()){
		ap.acceptingAge();
	}catch(AgeInvalidException ae){
		System.out.println(ae);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Employee john=new Employee("John",101,"SE",new Address("MG Road","Pune",41101));
	
	
	*/
	
	
	/*SetDemo sNew=new SetDemo();
	sNew.addNames();
	sNew.showNames();*/
	
	
	/*ListDemo l=new ListDemo();
	//System.out.println("Intersection is: "+l.intersectLists());
	System.out.println("Union of List is: "+l.unionLists());	
	*/
	
/*	MapDemo myMap=new MapDemo();
	myMap.showEmployee();
	*/
	
	/*
	ReadWriteFile rw=new ReadWriteFile();
	rw.toWrite();
	rw.toRead();*/
	
	
	ReadWriteProperties rw=new ReadWriteProperties();
	
	rw.toWrite();
	//rw.toRead();
	
	
	
	
	
	
	
	
	
	
	
}
}
