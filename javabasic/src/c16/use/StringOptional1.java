package c16.use;

import java.util.Optional;

//Optional 클래스의 기본적인 사용 방법1
//public final class Optional<T> extends Object{
//private final T value;->이 참조 변수를 통해 저장을 하는 일종의 래퍼 클래스
public class StringOptional1 {
	public static void main(String[] args) {
		//of는 null을 허용하지 않음
		Optional<String> os1=Optional.of(new String("Toy1"));
		//ofNullable은 null허용
		Optional<String> os2=
				Optional.ofNullable(new String("Toy2"));
		//isPresent()메소드
		//Optional 객체가 값을 가지고 있다면 true, 값이 없다면 false리턴
		if(os1.isPresent())
			System.out.println(os1.get());
		//get() - Optional 안의 값을 접근 할 때 사용
		if(os2.isPresent())
			System.out.println(os2.get());
		//ifPresent() - Optional 객체가 값을 가지고 있으면 실행
		//값이 없으면 넘어간다
		//매개변수가 함수형 인터페이스이다
		//람다식 버전
		os1.ifPresent(s->System.out.println(s));
		//메소드 참조 버전
		os1.ifPresent(System.out::println);
		
		//Optional클래스를 사용하면 if~else문을 대신해서 간편하게
		//사용할 수 있다.
	}

}