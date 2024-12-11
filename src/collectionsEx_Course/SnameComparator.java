package collectionsEx_Course;

import java.util.Comparator;

public class SnameComparator implements Comparator<CourseEx> {

	@Override
	public int compare(CourseEx o1, CourseEx o2) {
		// TODO Auto-generated method stub
		return o1.getSName().compareTo(o2.getSName());
	}

}
