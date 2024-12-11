package collectionsEx_Customer;

import java.util.Comparator;

public class CidComparator implements Comparator<CustomerEx>{

	@Override
	public int compare(CustomerEx o1, CustomerEx o2) {
		// TODO Auto-generated method stub
		return o1.getCid().compareTo(o2.getCid());
	}

}
