package collectionsEx_Customer;

public class CustomerEx implements Comparable<CustomerEx>{
	
//	private int Cid;
	private Integer Cid;
	private String Cname;
	private String CAddress;
	private String HName;
//	private float Ratings;
	private Float Ratings;
	
	
	public Integer getCid() {
		return Cid;
	}
	public void setCid(Integer cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCAddress() {
		return CAddress;
	}
	public void setCAddress(String cAddress) {
		CAddress = cAddress;
	}
	public String getHName() {
		return HName;
	}
	public void setHName(String hName) {
		HName = hName;
	}
	public Float getRatings() {
		return Ratings;
	}
	public void setRatings(Float ratings) {
		Ratings = ratings;
	}
	
	public CustomerEx(int cid, String cname, String cAddress, String hName, float ratings) {
		super();
		Cid = cid;
		Cname = cname;
		CAddress = cAddress;
		HName = hName;
		Ratings = ratings;
	}
	
	
	@Override
	public String toString() {
		return "CustomerEx [Cid=" + Cid + ", Cname=" + Cname + ", CAddress=" + CAddress + ", HName=" + HName
				+ ", Ratings=" + Ratings + "]";
	}
	@Override
	public int compareTo(CustomerEx o) {
		// TODO Auto-generated method stub
//		return this.Cid-o.Cid;
//		return this.Cid.compareTo(o.Cid);
//		return this.Cname.compareTo(o.Cname);
		return this.Ratings.compareTo(o.Ratings);
	}
	
	

}
