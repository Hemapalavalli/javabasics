package java8_Streams;

public class HostelsStreams {
	
	private String HName;
	private String PName;
	private Integer no_of_Persons_perroom;
	private Integer no_of_rooms_perfloor;
	private Integer HFee;
	
	public String getHName() {
		return HName;
	}
	public String getPName() {
		return PName;
	}
	public Integer getNo_of_Persons_perroom() {
		return no_of_Persons_perroom;
	}
	public Integer getNo_of_rooms_perfloor() {
		return no_of_rooms_perfloor;
	}
	public Integer getHFee() {
		return HFee;
	}
	public void setHFee(Integer hFee) {
		this.HFee = hFee;
	}
	
	public HostelsStreams(String hName, String pName, Integer no_of_Persons_perroom, Integer no_of_rooms_perfloor,
			Integer hFee) {
		super();
		HName = hName;
		PName = pName;
		this.no_of_Persons_perroom = no_of_Persons_perroom;
		this.no_of_rooms_perfloor = no_of_rooms_perfloor;
		HFee = hFee;
	}
	@Override
	public String toString() {
		return "HostelsStreams [HName=" + HName + ", PName=" + PName + ", no_of_Persons_perroom="
				+ no_of_Persons_perroom + ", no_of_rooms_perfloor=" + no_of_rooms_perfloor + ", HFee=" + HFee + "]";
	}
}
