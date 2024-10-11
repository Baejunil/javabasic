package c11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LinkedList
//LinkedList는 List구현 클래스이므로 ArrayList와 사용 방법은 똑같은데.
//내부 구조는 완전 다릅니다. ArrayList는 내부 배열에 객체를 저장해서
//관리하지만, LinkedList는 인접 참조를 링크해서 체인처럼 관리합니다.
//LinkedList에서 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고
//나머지 링크는 변경되지 않습니다. 특정 인덱스에 객체를 삽입할 때에도 마찬가지입니다.
//=> 비번한 객체 삭제와 삽입이 일어나는 곳에서는 ArratList보다 LinkedList가
//더 좋은 성능을 발휘합니다.
public class LinkedListClass {
	public static void main(String[] args) {
		//LinkedList를 생성
		//저장할 객체 타입을 <>을 타입 파라미터로 표기 합니다
		List<String> list1=new LinkedList<>();
		LinkedList<Double> list2=new LinkedList<>();
		
		//ArrayList와 LinkedList의 실행 성능 비교
		List<String> l1=new ArrayList<String>();
		List<String> l2=new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for(int i=0;i<1000;i++) {
			l1.add(0,String.valueOf(i));
			}
		endTime=System.nanoTime();
		System.out.println("Arratlist 걸린시간:"+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();
		for(int i=0;i<1000;i++) {
			l2.add(0,String.valueOf(i));
			}
		endTime=System.nanoTime();
		System.out.println("Linkedlist 걸린시간:"+(endTime-startTime)+"ns");
		
		//끝에서부터(순차적으로)추가 또는 삭제하는 경우는 ArrayList가 빠르지만
		//중간에 추가,삭제하는 경우는 앞뒤 링크 정보만 변경하면 되는 LInkedList가
		//더 빠릅니다.ArrayList는 뒤쪽 인덱스 들을 모두 1씩 증가 또는 감소시키는
		//시간이 필요하므로 처리 속도가 느립니다
		//구분		| 순차적으로 추가/삭제 | 중간에 추가/삭제 | 검색
		//ArratList| 빠르다			   | 느리다		  | 빠르다
		//LinkedList| 느리다 			   | 빠르다		  | 느리다
	}
}
