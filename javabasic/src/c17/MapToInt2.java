package c17;

import java.util.Arrays;
import java.util.List;

public class MapToInt2 {
	public static void main(String[] args) {
		//맵핑 : map의 친구들
		//IntStream mapToInt(ToIntFuction<T> mapper)
		//LongStream mapToLong(ToLongFunction<T> mapper)
		//DoubleStream mapToDouble(ToDoubleFunction<T> mapper)
		List<String> ls=Arrays.asList("Box","Robot","Simple");
		ls.stream().mapToInt(s->s.length())
			.forEach(n->System.out.print(n+"\t"));
	}

}