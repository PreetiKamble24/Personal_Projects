package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	List<Integer> l1;
	List<Integer> l2;
	List<Integer> l3;
	
	public ListDemo() {
	l1=new ArrayList<>();
	l2=new ArrayList<>();
	l3=new ArrayList<>();
	l1.add(2);l1.add(3);l1.add(4);
	l2.add(2);l2.add(3);l2.add(6);
	}
	
	public List<Integer> intersectLists(){
	
		for(int value:l1){
		if(l2.contains(value))
			l3.add(value);
		}
		return l3;
	}
	
	
	public List<Integer> unionLists(){
		l3.addAll(l1);
		for(int value:l2){
		if(!l3.contains(value))
			l3.add(value);
		}
		return l3;
	}
}
