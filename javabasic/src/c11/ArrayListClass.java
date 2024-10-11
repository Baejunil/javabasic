package c11;

import java.util.ArrayList;
import java.util.List;

//ArrayList
//ArrayList는 List인터페이스의 대표적인 구현 클래스입니다.
public class ArrayListClass {
	public static void main(String[] args) {
		//ArrayList 객체를 생성
		//List<E> list=new ArrayList<E>;
		//E->타입 파라미터
		//ArrayList를 생성하기 위해서는 저장할 객체 타입을 E 타입 파리미터 자리에
		//표기하고 기본 생성자를 호출하면 됩니다.
		List<String> list= new ArrayList<String>();
		List<Integer> list1= new ArrayList<Integer>();
		//아래의 코드와 같이 ArrayList의 E 타입 파리미터를 생략하면
		//왼쪽 List에 지정된 타입을 따라 갑니다.
		List<ArrayListClass> list2= new ArrayList<>();
		
		//기본 생성자로 ArratList 객체를 생성하면 내부에 10개의 객체를
		//저장할 수 있는 초기용량을 가지게 됩니다.
		//저장되는 객체 수가 늘어나면 용량이 자동으로 증가합니다.
		
		//ArrayList에 객체를 추가하면 0번 인덱스로부터 차례대로 저장됩니다,
		//ArrayList에서 특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터
		//마지막 인덱스까지 모두 앞으로 1씩 당겨집니다.
		//마찬가지로 특정 인덱스에 객체를 삽입하면 해당 인덱스로부터 마지막
		//인덱스까지 모두 1씩 밀려납니다.
		//=>이런 동작 때문에 저장된 객체 수가 많고, 특정 인덱스에 객체를
		//추가하거나 제거하는 일이 비번하다면 ArrayList보다는 조금 후에
		//학습할 LinkedList를 사용하는 것이 좋습니다
		//하지만 인덱스를 이용해서 객체를 찾거나 맨 마지막에 객체를 추가하는
		//경우에는 ArrayList가 더 좋은 성능을 발휘합니다.
		
		//String 객체를 저장하는 ArrayList
	}
}
