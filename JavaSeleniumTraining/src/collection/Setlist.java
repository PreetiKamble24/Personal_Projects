package collection;

import java.util.ArrayList;
import java.util.List;

public class Setlist {

	List<Integer> l1, l2, l3;
	
	public Setlist(){
		l1 = new ArrayList<>();
		l2 = new ArrayList<>();
		l3 = new ArrayList<>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l2.add(7);
		l2.add(8);
		l2.add(9);
		l2.add(2);
		l2.add(3);
	}
	
	public void getIntersect(){
		for(int value:l1) 
		if(l2.contains(value)){
			System.out.println(value);
		}
			
		
	}
	
	public List<Integer> getUnion(){
				
		l3.addAll(l1);
		for (int value:l2)
			if(!l3.contains(value))
				l3.add(value);
		return l3;
	}
		
			
		
		
}
