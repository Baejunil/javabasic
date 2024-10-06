package c07;

//메소드 재정의 - 메소드 오버라이딩(Overriding)
//상속된 메소드를 자식 클래스에서 다시 수정해서 덮어 쓰는 것을 말합니다.

//메소드 재정의 방법
// - 부모의 메소드와 동일한 시그니처(리턴 타입, 메소드 이름, 매개 변수 목록)를
//가져야 합니다.
// - 접근 제한을 더 강하게 재정의할 수 없습니다.
// - 새로운 예외(Exception)를 throws할 수 없습니다.
public class Calculator {
	//원의 넓이를 구하는 메소드
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return 3.14159*r*r;
	}

}
