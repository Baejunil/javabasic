package c06.dto;
//DTO,VO,Entity
public class Person {
	private String name;
	private String phone;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("김자바1");
		p1.setPhone("010-1234-568");
		Person p2=new Person();
		p1.setName("김자바2");
		p1.setPhone("010-1234-568-2");
		Person p3=new Person();
		p1.setName("김자바3");
		p1.setPhone("010-1234-568-3");
		
		Person[] pArr=new Person[100];
		pArr[0]=p1;
		pArr[1]=p2;
		pArr[2]=p3;
		for(int i=0;i<1;i++) {
			System.out.println(pArr[i].toString());
		}
		
	}
}
