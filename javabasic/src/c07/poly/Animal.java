package c07.poly;

//자동 타입 변환
//클래스도 타입 변환이 있는데, 클래스의 변환은 상속 관계에 있는
//클래스 사이에서 발생합니다.
//자식은 부모 타입으로 자동 타입 변환이 가능합니다.
public class Animal {
	public void method1() {
		System.out.println("Parent-method1 called");
	}
	public void method2() {
		System.out.println("Parent-method2 called");
	}
}
