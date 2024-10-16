package c16.use;

import java.util.Optional;

public class OptionalMap {
	public static void main(String[] args) {
		//map 메소드의 소개
		//public <U> Optionla<U> map(Function<?,?> mapper)
		//map 메소드는 apply 메소드가 번환하는 대상을 Optinal
		//인스턴스에 담아서 반환한다
		Optional<String> os1=Optional.of("Optional String");
		Optional<String> os2=os1.map(s->s.toUpperCase());
		System.out.println(os2.get());
		//매핑 - 어떤 값을 다른 값에 대응시키는 과정을 의미한다
		
		Optional<String> os3=os1.map(s->s.replace(' ','_'))
				.map(s->s.toLowerCase());
		System.out.println(os3.get());
		
		
	}

}