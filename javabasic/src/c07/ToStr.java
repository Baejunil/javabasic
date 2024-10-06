package c07;

//자바의 모든 클래스는 Object 클래스를 상속하고 있다
//extends Object 생략되어 있는 것입니다.
public class ToStr {
	private int num;
	
	//@Override 어노테이션
	//컴파일러에게 이 어노테이션 아래에 나오는 메소드는 메소드 오버라이딩을 하는 것이다
	//라고 미리 알려 주는 겁니다.
	//메소드 오버라이딩 문법에 어긋나면 컴파일 에러가 발생
	@Override
	public String toString() {
		return "ToStr [num=" + num + "]";
	}
	
	public String toString(int num) {
		return "";
	}

}
