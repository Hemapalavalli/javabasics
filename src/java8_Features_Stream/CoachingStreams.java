package java8_Features_Stream;

public class CoachingStreams {
	
	private String Sname;
	private int sAge;
	private String Cname;
	private int Cfee;
	private long number;
	
	public String getSname() {
		return Sname;
	}
	public int getsAge() {
		return sAge;
	}
	public String getCname() {
		return Cname;
	}
	public int getCfee() {
		return Cfee;
	}
	public long getNumber() {
		return number;
	}
	
	public CoachingStreams(String sname, int sAge, String cname, int cfee, long number) {
		super();
		Sname = sname;
		this.sAge = sAge;
		Cname = cname;
		Cfee = cfee;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "CoachingStreams [Sname=" + Sname + ", sAge=" + sAge + ", Cname=" + Cname + ", Cfee=" + Cfee
				+ ", number=" + number + "]";
	}	
}
