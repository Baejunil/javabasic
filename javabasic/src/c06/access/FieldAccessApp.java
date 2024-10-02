package c06.access;

public class FieldAccessApp {

	public static void main(String[] args) {
		FieldAccess fa=new FieldAccess();
//		fa.name="John Doe";
//		System.out.println(fa.name);
		//객체 지향 4대 요소
		//추상화, 캡슐화, 상속성, 다형성
		//클래스 변수를 다른 클래스에서 직접 접근 하는 것은
		//객제 지향 관점의 캡슐화에 위배 된다.
		//객체에는 기능별로 코드의 응집도를 높이고 결합도를 낮추어야 합니다.
		//객체지향언어는 유지보수성과 확장성이 좋아야 합니다.
		
		//setter 메소드에 의한 클래스 변수에 값 할당은 아무런 문제가 없다.
		fa.setNumber(1);
		System.out.println(fa.getNumber());
	}

}