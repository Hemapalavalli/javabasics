package collectionsEx_Course;

public class CourseEx implements Comparable<CourseEx>{

	private Integer SId;
//	private int SId;
	private String SName;
	private String CName;
	private String LName;
//	private int CFee;
	
//	private long CFee;
	private Long CFee;
	
//	public int getSId() {
//		return SId;
//	}
//	public void setSId(int sId) {
//		SId = sId;
//	}
	
	public Integer getSId() {
		return SId;
	}
	public void setSId(Integer sId) {
		SId = sId;
	}
	
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
//	public int getCFee() {
//		return CFee;
//	}
//	public void setCFee(int cFee) {
//		CFee = cFee;
//	}
	public Long getCFee() {
		return CFee;
	}
	public void setCFee(Long cFee) {
		CFee = cFee;
	}
//	public long getCFee() {
//		return CFee;
//	}
//	public void setCFee(long cFee) {
//		CFee = cFee;
//	}
	
	
	@Override
	public String toString() {
		return "CourseEx [SId=" + SId + ", SName=" + SName + ", CName=" + CName + ", LName=" + LName
				+ ", CFee=" + CFee + "]";
	}
	
	@Override
	public int compareTo(CourseEx o) {		
//		return this.SId-o.SId;
//		return this.SId.compareTo(o.SId);
//		return this.SName.compareTo(o.SName);
		return this.LName.compareTo(o.LName);
//		return (int) (this.CFee-o.CFee);
//		return this.CFee.compareTo(o.CFee);
	}
}
