package c17;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MapToInt {
	public static void main(String[] args) {
		//맵핑 - mapping
		//맵(map)은 스트림 내 요소들을 하나씩 특정 값으로 변환해 줍니다.
		//이 때 값을 변환하기 위한 람다를 인자로 받습니다.
		//<R> Stream<R> map(Function<? super T,? extends R> mapper)
		//스트림에 들어가 있는 값이 input이 되어서 특정 로직을 거친 후
		//output이 되어 새로운 스트림에 담기게 됩니다.
		//이러한 작업을 맵핑(mapping)이라고 합니다.
		
		//문자열 리스트를 문자열 길이 리스트로 맵핑
		List<String> ls=Arrays.asList("Box","Robot","Simple");
		ls.stream().map(s->s.length())
			.forEach(n->System.out.println(n));
		
		for(String s:ls) {
			System.out.println(s.length());
		}
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().length());
		}
	}

}