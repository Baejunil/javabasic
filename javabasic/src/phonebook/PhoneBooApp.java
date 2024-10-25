package phonebook;

public class PhoneBooApp {
	public static void main(String[] args) {
		//Person p1=new Person();
		//p1.setName("테스트이름1");
	//	p1.setPhone("테스트전화번호1");
	//	System.out.println(p1);
		
		//MVC 패턴 적용 CRUD 기능
		//메뉴가 보이기
		//PhoneBookApp
		PhoneBookController pbc=new PhoneBookController();
		pbc.runApp();
	}
}
