package collectionsEx_Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseTest {

	public static void main(String[] args) {
		
		CourseEx c1=new CourseEx();
		c1.setSId(1);
		c1.setSName("Hema");
		c1.setCName("Java");
		c1.setLName("Venkat sir");
		c1.setCFee((long) 30000);
		
		CourseEx c2=new CourseEx();
		c2.setSId(2);
		c2.setSName("Mounika");
		c2.setCName("Javafullstack");
		c2.setLName("Krishna Sir");
		c2.setCFee((long) 35000);
		
		CourseEx c3=new CourseEx();
		c3.setSId(3);
		c3.setSName("Chari");
		c3.setCName("MYSQL");
		c3.setLName("Tarun Sir");
		c3.setCFee((long) 15000);
		
		CourseEx c4=new CourseEx();
		c4.setSId(4);
		c4.setSName("Pavan");
		c4.setCName("Devops");
		c4.setLName("Srinivas Sir");
		c4.setCFee((long) 20000);
		
		CourseEx c5=new CourseEx();
		c5.setSId(5);
		c5.setSName("Jagadesh");
		c5.setCName("Testing");
		c5.setLName("Krishna Sir");
		c5.setCFee((long) 30000);
		

		List<CourseEx> l=new ArrayList<CourseEx>();
		
		l.add(c5);
		l.add(c4);
		l.add(c3);
		l.add(c2);
		l.add(c1);
		
//		System.out.println(l);
//		Collections.sort(l);
//		System.out.println(l);
		
		Collections.sort(l, new SIdComparator());
		Collections.sort(l, new SnameComparator());
		Collections.sort(l, new LnameComparator());
		Collections.sort(l, new CNameComparator());
		Collections.sort(l, new CfeeComparator());
		System.out.println(l);
	}

}
