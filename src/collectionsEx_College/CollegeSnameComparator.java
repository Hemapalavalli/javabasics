package collectionsEx_College;

import java.util.Comparator;

public class CollegeSnameComparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		// TODO Auto-generated method stub
		return o1.getSname().compareTo(o2.getSname());
	}

}
