package c06;

//정적 멤버와 static
//정적(static)은 고정된이란 의미입니다
//정적 멤버는 클래스에 고정된 멤버로서 인스턴스를 생성하지 않고
//사용할 수 있는 필드와 메소드를 말합니다.
//이들을 각각 정적 필드, 정적 메소드라고 부릅니다.
public class StaticMember {
	static final Car car=new Car();
	String name;
	//정적 맴버 선언
	//정적 필드와 정적 메소드를 선언하려면 필드와 메소드 선언 시 static 키워드를 
	//추가적으로 붙이면 됩니다
	//정적 필드 : static 타입 변수이름[=초기화];
	//정적 메소드 : static 리턴타입 메소드 이름([매개변수,....]){}
	//인스턴스 필드
	String color;
	//인스턴스 메소드
	void setColor(String color) {
		this.color=color;
	}
	//정적필드
	static double pi=3.14;
	//정적메소드
	static int plus(int x, int y) {
		return x+y;
	}
	//최대한 정적 필드와 메소드는 사용을 자제하는 것이 좋다
	
	//정적 메소드는 인스턴스가 없어도 실행된다는 특징때문에
	//내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없습니다
	static void method1() {
		//tdis.color="화이트"(x)
		System.out.println(pi ); //static 마이사용은 비추
	}
	public static void main(String[] args) {
		System.out.println("static method");
		Math.random();
		//정적 멤버 사용
		//클래스가 메모리로 로딩되면 정적 멤버를 바로 사용할수 있는데
		//클래스 이름과 도트 연산자로 접근합니다
		//StaticMember.color;//(x)
		System.out.println(StaticMember.pi);
		System.out.println(StaticMember.plus(3, 4));
	}

}
