package collectionsEx_College;

public class College implements Comparable<College>{
//public class College implements Comparable{

//	private int cid;
	private Integer cid;
	private String cname;
	private String sname;
	private String branch;
//	private long phno;
	private Long phno;
	
//	public int getCid() {
//		return cid;
//	}
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", sname=" + sname + ", branch=" + branch + ", phno=" + phno
				+ "]";
	}
	
	@Override
	public int compareTo(College o) {
//		return this.cid-o.cid;
		return this.cid.compareTo(o.cid);
//		return this.cname.compareTo(o.cname);
//		return this.sname.compareTo(o.sname);
//		return this.branch.compareTo(o.branch);
//		return (int) (this.phno-o.phno);
//		return this.phno.compareTo(o.phno);
	}
	
//	@Override
//	public int compareTo(Object o) {
//		College o1=(College)o;
//		return this.cid-o1.cid;
//		return this.cname.compareTo(o1.cname);
//		return this.sname.compareTo(o1.sname);
//		return this.branch.compareTo(o1.branch);
//		return (int) (this.phno-o.phno);
//	}
	
}
