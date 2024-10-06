package c07;

public class Student extends People {
	private int studentNo;

	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	//부모 생성자 호출
	//현실에서 부모 없는 자식이 있을 수 없듯이 자바에서도 자식 객체를 생성하면
	//부모 객체가 먼저 생성되고 그다음에 자식 객체가 생성됩니다.
	public Student(String name, String ssn,int studentNo) {
		super(name, ssn);
		//super()는 부모의 생성자를 호출합니다.
		//super()은 생성자 내부에서 항상 첫줄에 나와야 됩니다.
		//super() this()는 동시에 쓸수 없다
		this.studentNo=studentNo;
	}
	public static void main(String[] args) {
		Student s=new Student("김자바", "020101-0323131", 23487234);
	}

}
