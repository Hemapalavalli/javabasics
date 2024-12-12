package collectionsEx_College;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollegeTest{
	public static void main(String[] args) {
		
		College c=new College();
		c.setCid(501);
		c.setCname("VEC");
		c.setSname("Hema");
		c.setBranch("CSE");
		c.setPhno(798164268);
		
		College c1=new College();
		c1.setCid(502);
		c1.setCname("VITS");
		c1.setSname("Vyshu");
		c1.setBranch("ECE");
		c1.setPhno(756909440);
		
		College c2=new College();
		c2.setCid(503);
		c2.setCname("VEC");
		c2.setSname("Pradeep");
		c2.setBranch("CSE");
		c2.setPhno(988546932);
		
		College c3=new College();
		c3.setCid(504);
		c3.setCname("VITS");
		c3.setSname("Chandu");
		c3.setBranch("ECE");
		c3.setPhno(837437578);
		
		List<College> l=new ArrayList<College>();
		l.add(c1);
		l.add(c3);
		l.add(c);
		l.add(c2);
		
		System.out.println(l);
		Collections.sort(l);
//		l.sort(null);
		System.out.println(l);
		
//		Collections.sort(l, new CollegeIdComparator());
//		Collections.sort(l, new CollegeCnameComparator());
		Collections.sort(l, new CollegeSnameComparator());
		System.out.println(l);
		
	}
}