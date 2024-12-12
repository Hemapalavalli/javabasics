package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CLinkedHashMap {

	public static void main(String[] args) {
		
		Map<String, String> m=new HashMap<String, String>();
		m.put("Andhra", "Hema");
		m.put("Nellore", "Mounika");
		m.put("Telangana", "Jagadesh");
		m.put("TS", "Pavan");
		m.put("Kadapa", "Chari");
		
		Map m1=new LinkedHashMap(m);
		System.out.println(m1);
		
		Iterator<String> i=m1.keySet().iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s+" "+m1.get(s));
		}
		
		Iterator<Map.Entry<String, String>> it=m1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> e = it.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		Map<String, Integer> m2=new TreeMap(m);
		System.out.println(m2);
	}
}
