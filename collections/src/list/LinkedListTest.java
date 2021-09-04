package list;
import java.util.*;
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Object> link= new LinkedList<Object>();
		link.add("Vcentry");
		link.add('a');
		link.add("selenium");
	    link.add(10);
		link.add(true);
		link.add(10);
		link.add(1,'b');
		link.add(null);
		
		
		Iterator it = link.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//		}
		
		for(;it.hasNext();) {
			System.out.println(it.next());
		}
		
		
	}

}
