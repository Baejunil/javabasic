package phonebook;

public class PhoneBookController {
	
	private PhoneBookView pbv=new PhoneBookView();
	private PhoneBookService pbs=new PhoneBookService();
	
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
				pbs.addPerson(p);
				break;
			case 2:
			//전번 보기
				pbv.printPersons(pbs.getPersons());
				break;
			case 3:
				//이름으로 검색
				String name=pbv.getName();
				Person person=pbs.searchPerson(name);
				pbv.printPerson(person);
				break;
			case 4:
				//연락처를 수정
				//이름으로 검색
				String editName=pbv.getName();
				Person editPerson=pbs.searchPerson(editName);
				Person editedPerson=pbv.editPerson(editPerson);
				pbs.getPersons().set(editPerson.getIdx(), editedPerson);
				break;
			case 5:
				//연락처 삭제하기
				//이름으로 검색
				String dName=pbv.getName();
				Person dPerson=pbs.searchPerson(dName);
				pbs.getPersons().remove(dPerson.getIdx());
			}
		}
	}
	
	public void setTestData() {
		Person p1=new Person();
		p1.setName("테스트1");
		p1.setPhone("테스트전번1");
		Person p2=new Person();
		p2.setName("테스트2");
		p2.setPhone("테스트전번2");
		Person p3=new Person();
		p3.setName("테스트3");
		p3.setPhone("테스트전번3");
		pbs.addPerson(p1);
		pbs.addPerson(p2);
		pbs.addPerson(p3);
	}
}