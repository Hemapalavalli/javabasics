package collectionsEx_Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		
		CustomerEx c1=new CustomerEx(501, "Hema", "kavali", "VijayDurga", 4.5f);
		CustomerEx c2=new CustomerEx(502, "Vyshu", "Ongole", "Ismail", 3.9f);
		CustomerEx c3=new CustomerEx(503, "Pradeep", "Tangutur", "Dolphin", 4f);
		CustomerEx c4=new CustomerEx(504, "Chandu", "Singarayakonda", "Cherries", 3.5f);
		
		List<CustomerEx> l=new ArrayList<CustomerEx>();
		l.add(c4);
		l.add(c3);
		l.add(c2);
		l.add(c1);
		
		System.out.println(l);
		l.sort(null);
		System.out.println(l);
		
		l.sort(new CidComparator());
		l.sort(new CnameComparator());
		l.sort(new HNameComparator());
		l.sort(new RatingsComaparator());
		
		System.out.println(l);
	}

}
