package collectionsEx_Course;

import java.util.Comparator;

public class LnameComparator implements Comparator<CourseEx>{

	@Override
	public int compare(CourseEx o1, CourseEx o2) {
		// TODO Auto-generated method stub
		return o1.getLName().compareTo(o2.getLName());
	}

}
