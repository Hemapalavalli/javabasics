package fundamentals;

public class Methods {
	
	private int sId;
	private String sName;
	private long sNumber;
	private String sAddress;
	
	void getdetails() {
		System.out.println(getSId());
	}
	public int getSId() {
		System.out.println(getSName());
		return sId;
	}

	public void setSId(int SId) {
		this.sId = sId;
	}

	public String getSName() {
		System.out.println(getSNumber());
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getSNumber() {
		System.out.println(getSAddress());
		return sNumber;
	}
	public void setSNumber(long sNumber) {
		this.sNumber = sNumber;
	}

	public String getSAddress() {
		return sAddress;
	}

	public void setSAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public static void main(String[] args) {
		Methods m=new Methods();
		m.sId=501;
		m.sName="Hemalatha";
		m.sNumber=798164273;
		m.sAddress="Hydrebad";
		
		m.getdetails();
		
		
		
	}

}
