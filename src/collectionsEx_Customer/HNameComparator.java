package collectionsEx_Customer;

import java.util.Comparator;

public class HNameComparator implements Comparator<CustomerEx>{

	@Override
	public int compare(CustomerEx o1, CustomerEx o2) {
		// TODO Auto-generated method stub
		return o1.getHName().compareTo(o2.getHName());
	}

}
