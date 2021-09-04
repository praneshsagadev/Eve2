package setTest;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedHashSet	 has = new LinkedHashSet();
	
	has.add('d');
	has.add('a');
	has.add("author");
	has.add("vcentry");
	has.add(10);
	has.add(null);
	has.add(5);
	has.add(true);
	has.add('d');
	has.add("author");
	
	
	Iterator it = has.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	}

}
