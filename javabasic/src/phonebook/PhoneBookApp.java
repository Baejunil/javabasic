package phonebook;

public class PhoneBookApp {
	
	public static void main(String[] args) {
//		Person p1=new Person();
//		p1.setName("테스트이름1");
//		p1.setPhone("테스트전화번호1");
//		System.out.println(p1);
		
		//MVC패턴 적용 CRUD 기능
		//메뉴가 보이기
		//PhoneBookApp
		PhoneBookController pbc=new PhoneBookController();
		//테스트 데이터 넣기
		pbc.setTestData();
		pbc.runApp();
	}

}