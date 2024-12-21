package java8_Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HostelTest {
	
	public static void main(String[] args) {

		List<HostelsStreams> HL = Arrays.asList(new HostelsStreams("Vasundhara", "Hema", 4, 20, 6000),
				new HostelsStreams("Ritz", "Vyshu", 3, 15, 7100),
				new HostelsStreams("Laxmi", "Chandu", 5, 10, 5500),
				new HostelsStreams("Ritzs Men's Hostel", "Pradeep", 4, 19, 7000));
		
//		HostelTest h=new HostelTest();
//		System.out.println(h.sortname(HL));
//		System.out.println(h.Fname(HL));
//		System.out.println(h.RHname(HL));
//		System.out.println(h.HHFee(HL));
		
		System.out.println(HL.stream().sorted((v1,v2) -> v2.getHFee().compareTo(v1.getHFee())).skip(3).collect(Collectors.toMap(h->h.getHName(), h -> h.getHFee())));
		System.out.println(HL.stream().collect(Collectors.toMap(e -> e.getHName(), e -> e.getHFee())));
		
//		.map(s->s.getHFee()+".00").limit(2).toList()
	}
	
	public Set<HostelsStreams> sortname(List<HostelsStreams> l) {
		return l.stream().sorted((v1,v2) -> v2.getHName().compareTo(v1.getHName())).collect(Collectors.toSet());
	}
	
	public HostelsStreams Fname(List<HostelsStreams> l) {
		return l.stream().sorted((v1,v2) -> v2.getHName().compareTo(v1.getHName())).findFirst().get();
	}
	
	public Set<HostelsStreams> RHname(List<HostelsStreams> rhl) {
		return rhl.stream().filter(v-> v.getHName().startsWith("R")).sorted((v1,v2) -> v1.getHName().compareTo(v2.getHName())).collect(Collectors.toSet());
	}
	public List<String> HHFee(List<HostelsStreams> hhf) {
		return hhf.stream().sorted((v1,v2) -> v2.getHFee().compareTo(v1.getHFee())).limit(2).map(s->s.getHFee()+".00").toList();
	}

}
