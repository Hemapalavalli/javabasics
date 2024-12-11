package collectionsEx_Course;

import java.util.Comparator;

public class CfeeComparator implements Comparator<CourseEx>{

	@Override
	public int compare(CourseEx o1, CourseEx o2) {
		// TODO Auto-generated method stub
		return o1.getCFee().compareTo(o2.getCFee());
	}

}
