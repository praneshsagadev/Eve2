package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
HashMap<String, String> hashMap= new HashMap();
		
		hashMap.put("username", "123@gmail.com");
		hashMap.put("password", "123456");
		hashMap.put("address", "guindy");
		hashMap.put("name", "vcentry");
		hashMap.put("address", "KK nagar");
		hashMap.put("mob", "123456");
		hashMap.put("address", "CMBT");
		hashMap.put(null, "nullvalue");
		hashMap.put("mob", null);
		hashMap.put(null, "nullvalue1");
		hashMap.put("mob1", null);
		
	//	System.out.println(hashMap.get("username"));
		
		Set s=hashMap.keySet();
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			Object key=it.next();
			System.out.println(key + ": "+hashMap.get(key));
			
		
		}
		

	}

}
