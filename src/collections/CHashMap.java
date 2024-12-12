package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class CHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(11, "Hema");
		m.put(22, "Mounika");
		m.put(13, "Pavan");
		m.put(44, "Chari");
		m.put(25, "Jagadesh");
		
		Iterator i = m.keySet().iterator();
		for (; i.hasNext();) {
			int t = (int) i.next();
			System.out.println(t);
			System.out.println(m.get(t));
		}
		Iterator ir=m.entrySet().iterator();
		while(ir.hasNext()) {
			Map.Entry<Integer, String> e= (Map.Entry<Integer, String>) ir.next();
			System.out.println(e.getKey()+" "+e.getValue() );
		}
		Map<String,Integer> m2 = new TreeMap(m);
		System.out.println(m2);
		
		System.out.println();
		
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		m1.put(2,205);
		m1.put(13,206);
		m1.put(42,207);
		m1.put(10,204);
		m1.put(22,202); 
		
		Iterator<Integer> i1=m1.keySet().iterator();
		while(i1.hasNext()) {
			int t=(int)i1.next();
			System.out.println(t+" "+m1.get(t));
		}
		System.out.println();
		
		Iterator itr= m1.entrySet().iterator();
		while (itr.hasNext()) {
			Object o = (Object) itr.next();
			System.out.println(o);
		}
		
		System.out.println();
		Iterator<Entry<Integer, Integer>> ir1=m1.entrySet().iterator();
		while(ir1.hasNext()) {
			Entry<Integer, Integer> e=ir1.next();
			System.out.println(e.getKey()+" "+e.getValue() );
		}
		
		
		Map m3=new TreeMap(m1);
		System.out.println(m3);
		
	}
}
