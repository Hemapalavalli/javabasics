package collectionsEx_Course;

import java.util.Comparator;

public class CNameComparator implements Comparator<CourseEx>{

	@Override
	public int compare(CourseEx o1, CourseEx o2) {
		// TODO Auto-generated method stub
		return o1.getCName().compareTo(o2.getCName());
	}

}
