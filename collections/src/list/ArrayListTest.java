package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList  a = new ArrayList();
		//<> generic - specifies string or character or integer
		a.add('a');
		a.add("selenium");
		a.add(10);
		a.add(true);
		a.add(10);
		
		
//		Object obj = a.get(i);
//		
//		for(int i=0;i<a.size();i++) {
//				System.out.println(a.get(i));
//		}
		Iterator it =a.iterator();
//		
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//			
//	}
		
		for(;it.hasNext();) {
			
			System.out.println(it.next());
		}
		
		

	}

}
