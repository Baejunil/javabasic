package c14;

//람다식을 쓸려는 인터페이스를 정의하는데
//컴파일러에게 함수형 인터페이스의 조건을 갖추었는지에 대한 검사를 컴파일러에게 요청
//함수형 인터페이스 : 추상 메소드가 딱 하나만 존재하는 인터페이스
//@FunctionalInterface 어노테이션을 붙여 주게 되면 함수형 인터페이스인지
//컴파일러가 검사를 해준다
@FunctionalInterface
public interface Cal {
	int cal(int a, int b);
//	int cal1(int a, int b);
}