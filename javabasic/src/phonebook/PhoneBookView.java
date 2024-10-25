package phonebook;

import java.util.List;
import java.util.Scanner;

//View - Console
public class PhoneBookView {
	
	private Scanner sc=new Scanner(System.in);
	
	//CRUD 기능
	public int getMenu() {
		System.out.println("전화번호부 입니다.");
		System.out.println(
			"0.종료 1.전화번호 추가 2.전화 번호 전체 보기 "
			+ "3.이름으로 검색 4.전화번호 수정 하기 5.전화번호 삭제 하기");
		System.out.print("메뉴 선택:");
		int choice=sc.nextInt();
		sc.nextLine();
		return choice;
	}
	//프로그램이 종료 되면 출력 되는 메세지
	public void bye() {
		System.out.println("전화번호부 종료되었습니다.");
	}
	
	//전화번호 추가
	public Person printSetPerson() {
		System.out.println("이름과 전화번호를 입력하세요.");
		System.out.print("이름:");
		String name=sc.nextLine();
		System.out.print("전화번호:");
		String phone=sc.nextLine();
		Person p=new Person();
		p.setName(name);
		p.setPhone(phone);
		return p;
	}
	
	//전화 번호 전체 보기
	public void printPersons(List<Person> persons) {
		for(Person p:persons) {
			System.out.println(p);
		}
	}
	
	//이름 입력 받기
	public String getName() {
		System.out.println("이름을 입력하세요.");
		System.out.print("이름:");
		String name=sc.nextLine();
		return name;
	}
	
	//연락처 수정
	public Person editPerson(Person p) {
		System.out.println("연락처를 수정합니다.");
		System.out.println("검색된 연락처");
		System.out.println(p);
		return printSetPerson();
	}
	
	//연락처 한개만 보여 주기
	public void printPerson(Person p) {
		System.out.println(p);
	}
}