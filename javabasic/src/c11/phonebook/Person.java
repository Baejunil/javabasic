package c11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<>();
		
		//프로그램의 기본 기능: CRUD
		//C -create 생성
		Person p1=new Person();
		p1.setName("김자바1");
		Person p2=new Person();
		p2.setName("김자바2");
		Person p3=new Person();
		p3.setName("김자바3");
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		//Read - 읽어오기
		for(Person p:persons) {
			System.out.println(p);
		}
		
		//Update - 수정 하기
		//인덱스 값 1번의 name 값을 김클립스로 수정하세요
		persons.get(1).setName("김클립스");
		System.out.println("인데스1:"+persons.get(1));
	
		//Delete -삭제 하기
		//인덱스 값 2번을 삭제 하세요
		persons.remove(2);
		//p3.setName("김자바3");
	}
}
