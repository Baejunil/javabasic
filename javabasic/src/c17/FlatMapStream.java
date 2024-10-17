package c17;

import java.util.Arrays;
import java.util.List;

public class FlatMapStream {
	public static void main(String[] args) {
		//Stream<T>의 flatMap 메소드
		//맵핑한 결과가 1:* 형태로 반환된다
		List<String> list=Arrays.asList("MYH_AGE","YOUR_LIFE");
		
		//_로 구분하여 새로운 리스트 생성하세요.
		list.stream().flatMap(s->Arrays.stream(s.split("_")))
		.forEach(s->System.out.println(s));
	}
}
