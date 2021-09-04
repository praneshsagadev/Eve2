package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap linkHashMap = new LinkedHashMap<>();

		linkHashMap.put("username", "123@gmail.com");
		linkHashMap.put("password", "123456");
		linkHashMap.put("address", "guindy");
		linkHashMap.put("name", "vcentry");
		linkHashMap.put("address", "KK nagar");
		linkHashMap.put("mob", "123456");
		linkHashMap.put("address", "CMBT");
		linkHashMap.put(null, "nullvalue");
		linkHashMap.put("mob", null);
		linkHashMap.put(null, "nullvalue1");
		linkHashMap.put("mob1", null);

//		System.out.println(linkHashMap.get("name"));

		Set s = linkHashMap.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {
			Object key = it.next();
			System.out.print(key + "--");
			System.out.print(linkHashMap.get(key));
			System.out.println();
		}

	}
}
