package phonebook;

import java.util.Scanner;

//View - Console
public class PhoneBookView {
	
	private Scanner sc=new Scanner(System.in);
	
	//CRUD 기능
	public int getMenu() {
		System.out.println("전화번호부 입니다.");
		System.out.println("0.종료, 1.전화번호 추가");
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
		System.out.println("전화 번호를 추가합니다.");
		System.out.print("이름:");
		String name=sc.nextLine();
		System.out.print("전화번호:");
		String phone=sc.nextLine();
		Person p=new Person();
		p.setName(name);
		p.setPhone(phone);
		return p;
	}
}