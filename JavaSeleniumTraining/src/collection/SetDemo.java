package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	Set<String> names;

	public SetDemo(){
		this.names = new HashSet<String>();
	}

	public Set<String> getNames() {
		return names;
	}

	public void setNames(Set<String> names) {
		this.names = names;
	}
	
	public void addNames(){
		this.names.add("John");
		this.names.add("Mangesh");
		this.names.add("Vishal");
		this.names.add("akshay");
	}
	
	public void showNames(){
		Iterator<String> itr=this.names.iterator();
		while(itr.hasNext())
			System.out.println("Value: "+itr.next());
	}
}
