package phonebook;

public class PhoneBookController {
	
	PhoneBookView pbv=new PhoneBookView();
	
	public void runApp() {
		while(true) {
			//메뉴 보여 주기
			int choice=pbv.getMenu();
			switch(choice) {
			case 0:
				pbv.bye();
				return;
			//전화번호 추가
			case 1:
				Person p=pbv.printSetPerson();
				System.out.println(p);
			}
			
		}
	}
}