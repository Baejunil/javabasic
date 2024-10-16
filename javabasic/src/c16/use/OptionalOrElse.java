package c16.use;

import java.util.Optional;

public class OptionalOrElse {
	public static void main(String[] args) {
		//Optionla의 orElse메소드
		//null일 경우 orElse의 매개변수로 전달된 인스턴스가 대신 반환
//		Optional<String> os1=Optional.ofNullable(null);
		//empty()->null을 감싸는 메소드
		Optional<String> os1=Optional.empty();
		Optional<String> os2=Optional.of("So Basic");
		
		String s1=os1.map(s->s.toString()).orElse("Empty");
		String s2=os2.map(s->s.toString()).orElse("Empty");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}