package c17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//스트림 생성하기:컬렉션 인스턴스
public class ListStream {
	public static void main(String[] args) {
		//컬렉션 인스턴스를 대상으로 스트림 생성시 호출하는 메소드
		//java.util.Collection<E>의 메소드
		//Stream<E>steam
		List<String> list=Arrays.asList("Toy","Robot","Box");
		List<String> list1= new ArrayList<String>();
		list1.add("Toy");
		list1.add("Robot");
		list1.add("Box");
		//스트림 생성
		list.stream().forEach(s->System.out.println(s+"\t"));
	}
}
