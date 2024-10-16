package c16;

//회사 정보에 속하는 회사 연락처와 주소
public class ContInfo {
	//null일 수 있음
	private String phone;
	private String adrs;
	public ContInfo(String phone, String adrs) {
		this.phone = phone;
		this.adrs = adrs;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdrs() {
		return adrs;
	}
	
	

}