package c15;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

//2.인스턴스 메소드 참조
public class ArrangeList3 {
	//?- 제네릭
	public void sort(List<?> lst) {
		Collections.reverse(lst);
	}
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,3,5,7,9);
		ls=new ArrayList<>(ls);
		ArrangeList3 al3=new ArrangeList3();
		//Consumer<List<Integer>> c=e->al3.sort(e);
		//accept로 전달된 것을 sort 그래도 전달하는 상황에서는
		//매개변수를 생략이 가능하다
		Consumer<List<Integer>> c=al3::sort;
		c.accept(ls);
		System.out.println(ls);
		
	}
}
