package c06;

public class Student {
	
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("s1 변수가 Student의 인스턴스를 참조합니다.");
		
		Student s2=new Student();
		System.out.println(
			"s2 변수가 또 다른 Student의 인스턴스를 참조합니다.");
		//인스턴스의 번지를 저장하는 것을 참조한다라고 한다.
		//비록 같은 클래스로부터 생성되었지만 각각의 Student객체는
		//자신만의 고유 데이터를 가지면서 메모리에서 활동하게 됩니다.
		//s1과 s2가 참조하는 Student객체는 완전히 독립된 서로 다른 객체입니다.
	}
}