package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOtherMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     ArrayList a = new ArrayList();
		
		a.add('a');
		a.add("selenium");
		a.add(10);
		a.add(true);
		a.add( "Automation");
		a.remove(0);
		
//		ArrayList b = new ArrayList();
//		
//		b.add('b');
//		b.add("Vcentry");
//		b.add(20);
//		b.add(false);
//		
//		
//		a.addAll(b);
//		a.addAll(1,b);
		Iterator it=a.iterator();
		Object obj1 = it.next();
		System.out.println(obj1 + " outside loop");
		a.remove(obj1);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++) 
		System.out.println(a.get(i));
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
