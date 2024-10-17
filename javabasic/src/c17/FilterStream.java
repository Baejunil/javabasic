package c17;

import java.util.Arrays;
import java.util.List;

public class FilterStream {
	public static void main(String[] args) {
		//스트림의 중간 연산
		//필터링 - 스트림을 구성하는 데이터 중 일부를 조건에 따라 걸러내는 연산
		//Stream<T>에 존재하는 메소드
		//Stream<T> filter(Predicate<? super T> predicate)
		//? - 제네릭의 와일드 카드
		//? super T -T거나 T가 상위인 타입을 받을 수 있다
		List<String> sl=Arrays.asList("Toy","Robot","Box");
		System.out.println(sl);
		//컬렉션 인스턴스 기반 스트림 생성
		//필터(filter)은 스트림 내 요소들을 하나씩 평가해서 걸러내는 작업입니다.
		//인자로 받는 Predicate는 Boolean을 리턴하는 함수형 인터페이스로
		//평가식이 들어가게 됩니다.
		sl.stream()
		//길이가 3이면 통과
//		.filter(s->{
//				System.out.println("필터링 중...");
//				return true;
//			});
		.filter(s->s.length()==3)
		.forEach(s->System.out.println(s));
	}

}