package c16;

//친구 정보에 속하는 회사 정보
public class Company {
	private String cName;
	//null일 수 있음
	private ContInfo cInfo;
	public Company(String cName, ContInfo cInfo) {
		this.cName = cName;
		this.cInfo = cInfo;
	}
	public String getcName() {
		return cName;
	}
	public ContInfo getcInfo() {
		return cInfo;
	}
	
	

}