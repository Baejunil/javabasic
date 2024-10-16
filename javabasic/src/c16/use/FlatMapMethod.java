package c16.use;

import java.util.Optional;

//Optional클래스의 flatMap메소드
//map은 람다식이 반환하는 내용물을 Optional로 감싸서 반환
//flatMap은 그냥 반환. 따라서 필요하면 직접 Optional로 감싸야 한다.
public class FlatMapMethod {
	public static void main(String[] args) {
		Optional<String> os1=Optional.of("Optional String");
		Optional<String> os2=os1.map(s->s.toUpperCase());
		System.out.println(os2.get());
		
		Optional<String> os3=
			os1.flatMap(s->Optional.of(s.toLowerCase()));
		System.out.println(os3.get());
		
	}

}