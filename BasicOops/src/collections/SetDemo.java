package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	Set<String> names;

	public SetDemo() {
	this.names=new TreeSet<>();
	}
	public Set<String> getNames() {
		return names;
	}

	public void addNames(){
		this.names.add("John");
		this.names.add("Riya");
		this.names.add("Shyam");
		this.names.add("Jade");
	}
	
	
	public void showNames(){
		Iterator<String> itr=this.names.iterator();
		while(itr.hasNext())
			System.out.println("Value:  "+itr.next());
		
	}
	
}
