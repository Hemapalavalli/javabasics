package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomObjectInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student();
		s.setId(10);
		s.setName("Purna");
		Student s1 =new Student();
		s1.setId(40);
		s1.setName("Hema");
		Student s3 =new Student();
		s3.setId(20);
		s3.setName("Jagadeesh");
		Student s2 =new Student();
		s2.setId(30);
		s2.setName("Pavan");
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(s);
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		//Collections.sort(stuList);
		System.out.println(stuList);
		//Comparable interface
		
		//Sorting based on ID with Comparator
		
		Collections.sort(stuList, new StudentIDComparator());
//		Collections.sort(stuList);
		System.out.println(stuList);
		
	}
}
