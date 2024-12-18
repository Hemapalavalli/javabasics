package java8_Features_Stream;

import java.util.Arrays;
import java.util.List;

public class CoachingTest {

	public static void main(String[] args) {
		
		List<CoachingStreams> c=Arrays.asList(new CoachingStreams("Hemalatha", 22, "Java", 27000, 798164268),
				 new CoachingStreams("Mounika",24,"SQL",18000,235674523),
				 new CoachingStreams("Pavan", 23, "DotNet", 20000, 876634538),
				 new CoachingStreams("PurnaChari", 22, "Devops",18000 , 567755359));

		List<CoachingStreams> CnameWithD = c.stream().filter(v->v.getCname().startsWith("D")).toList();
		System.out.println(CnameWithD);
		
		List<CoachingStreams> SnameWithP = c.stream().filter(cd -> cd.getSname().endsWith("a")).toList();
		System.out.println(SnameWithP);
		
		List<CoachingStreams> FeeWith18000 = c.stream().filter(cd -> cd.getCfee()==18000).toList();
		System.out.println(FeeWith18000);
		

	}

}
