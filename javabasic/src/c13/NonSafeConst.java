package c13;

public class NonSafeConst {
	
	public void who(int man) {
		switch(man) {
		case Person.MAN:
			System.out.println("남성 손님입니다.");
			break;
		case Person.WOMAN:
			System.out.println("여성 손님입니다.");
			break;
		}
	}
	public static void main(String[] args) {
		NonSafeConst nsc=new NonSafeConst();
		//정상적인 메소드 호출
		nsc.who(Person.MAN);
		//비정상적 메소드 호출
		nsc.who(Animal.DOG);
		//컴파일 및 실행 과정에서 발견되지 않는 오류
		//이전 방식의 문제점을 보완하고 인터페이스 기반 상수의 사용을 대체하기 위한
		//새로운 문법으로 만들어 진 것이 열거형(enum)
	}

}