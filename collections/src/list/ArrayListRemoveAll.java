package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       ArrayList a = new ArrayList();
		
		a.add('b');
		a.add("Vcentry");
		a.add(10);
		a.add(true);
		a.add(2, "Automation");
		a.add(null);
		a.add(10);
		a.add(false);
		ArrayList b = new ArrayList();
		
		b.add('b');
		b.add("Vcentry");
		b.add(20);
		b.add(false);
		
		
a.addAll(b);
		//a.removeAll(b);
	a.retainAll(b);
		
//a.clear();
//a.addAll(1,b);
		Iterator it=a.iterator();
//		Object obj1 = it.next();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
