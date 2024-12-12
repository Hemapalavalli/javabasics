package collectionsEx_College;

import java.util.Comparator;

public class CollegeCnameComparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		// TODO Auto-generated method stub
		return o1.getCname().compareTo(o2.getCname());
	}

}
