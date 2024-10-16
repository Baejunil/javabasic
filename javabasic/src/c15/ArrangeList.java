package c15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

//메소드 참조
//기본적으로 람다식보다 조금 더 코드를 단순하게 할 수 있다는 장점이 있다.
//일부 람다식을 메소드 참조로 대신하게 할 수 있다.
//메소드 참조의 4가지 유형
//1. static 메소드의 참조
public class ArrangeList {
	public static void main(String[] args) {
		//Collections 클래스의 reverse 메소드가 있다
		//public static void reverse(List<E> list)
		//기능은 저장 순서를 뒤집는다.
		List<Integer> ls=Arrays.asList(1,3,5,7,9);
		Collections.reverse(ls);
		System.out.println(ls);
		Consumer<List<Integer>> c=l->Collections.reverse(l);
		c.accept(ls);
		System.out.println(ls);
		//static 메소드의 참조를 할 때 람다식 안에서 메소드 참조를 사용 가능
		//메소드 참조 기반으로 수정
		Consumer<List<Integer>> c1=Collections::reverse;
		c1.accept(ls);
		System.out.println(ls);
		//accept메소드 호출 시 전달되는 인자를 reverse메소드를 호출하면서
		//그대로 전달한다는 약속에 근거한 수정
		//void accept(T t)
		//void reverse(List<E> list)
		
	}

}