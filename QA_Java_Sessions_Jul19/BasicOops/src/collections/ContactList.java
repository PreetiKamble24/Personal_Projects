package collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactList {

	Map<String,Set<Integer>> contactList;
	Set<Integer> numbers=new HashSet();
	public ContactList() {
		numbers.add(035355556);
		numbers.add(453434333);
		this.contactList.put("John",numbers);
	}
	
	public void search(String name){
		
	}
	
}
