package hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {

		Hashtable hashTable = new Hashtable();

		hashTable.put("username", "123@gmail.com");
		hashTable.put("password", "123456");
		hashTable.put("address", "guindy");
		hashTable.put("name", "vcentry");
		hashTable.put("address", "KK Nagar");
		hashTable.put("mob", "123456");
//		hashTable.put("mob", null);
//		hashTable.put(null, "nullvalue");

		// Method1
		Set s = hashTable.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			String key = it.next().toString();
			System.out.println(key + " " + hashTable.get(key));

		}

		System.out.println("--------------------");

// Method2- Using Enumeration
		
//		Enumeration e = hashTable.keys();
//		
//		while(e.hasMoreElements()) {
//			
//			String key = e.nextElement().toString();
//			
//			
//			System.out.println(key+ " " + hashTable.get(key));
			
	

	}

	}
	
