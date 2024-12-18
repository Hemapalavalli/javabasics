package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInternal_Execution {

	public static void main(String[] args) {
		
//		Map<String, String> m=new HashMap<String, String>();
//		m.put("Ongole", "Andhra");
//		m.put("Hyd", "TS");
//		m.put("Bnglr", "Karnataka");

		long hash="hyd".hashCode() & (15);
		System.out.println(hash);
		
//		long hash1="hyd1".hashCode() & (15);
//		System.out.println(hash1);
		
		long hash2="ongl".hashCode() & (15);
		System.out.println(hash2);
		
		System.out.println();
	}

}
