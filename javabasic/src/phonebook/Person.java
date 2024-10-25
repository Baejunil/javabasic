package phonebook;

//Model - DTO
public class Person {
	
	private String name;
	private String phone;
	private int idx;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
}