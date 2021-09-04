package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> a = new ArrayList<Object>();
		
		a.add('a');
		a.add("selenium");
		a.add(10);
		a.add(true);
		a.add(2, "Automation");
		a.add('a');
		
		ArrayList<Object> b = new ArrayList<Object>();
		
		b.add('b');
		b.add("Vcentry");
		b.add(20);
		b.add(false);
		b.add('b');
		
		a.addAll(b);
    	a.addAll(1,b);
		Iterator<Object> it=a.iterator();
//	Object obj1 = it.next();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
