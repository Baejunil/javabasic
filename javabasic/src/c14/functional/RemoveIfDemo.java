package c14.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//removeif 메소드를 사용해 보자
//Collection<E> 인터페이스의 디폴트 메소드
//default boolean removeIf(Predicate<E> filter)
//removeIf 메소드의 기능
//AttayList의 removeIf() 메소드는 인자로 전달된 조건으로 리스트의 아이템들을
//삭제합니다.
public class RemoveIfDemo {
	public static void main(String[] args) {
		List<Integer> ls1=Arrays.asList(1,-2,-3,-4,5);
		ls1=new ArrayList<>(ls1);
		
		List<Double> ls2=Arrays.asList(-1.1,2.2,3.3,-4.4,5.5);
		ls2=new ArrayList<>(ls2);
	
		//삭제의 조건
		//Character, Boolean을 제외하고 모든 Wrapper클래스는
		//Number클래스를 상속합니다
		Predicate<Number> p=n->n.doubleValue()<0.0;
		ls1.removeIf(p);
		ls2.removeIf(p);
		System.out.println(ls1);
		System.out.println(ls2);
	}
}
