package c16;

//친구 정보
public class Friend {
	private String name;
	//null 일 수 있음
	private Company cmp;
	public Friend(String name, Company cmp) {
		this.name = name;
		this.cmp = cmp;
	}
	public String getName() {
		return name;
	}
	public Company getCmp() {
		return cmp;
	}
	
	
}