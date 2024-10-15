package listmethos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//컬렉션 유용한 메소드
public class ListMethods {
	public static void main(String[] args) {
		//List<E>를 구현한 컬렉션 클래스들은 저장된 인스턴스를 정렬된 상태로
		//유지하지 않는다.
		//대신에 정렬을 해야 한다면 다음 메소드를 사용할 수 있다
		//public static E void sort(List<E> list)
		//Collections 클래스에 정의되어 있는 제네릭 메소드
		List<String> list=
				Arrays.asList("Toy","Box","Robot","Weapon");
		//Arrays.asList 메소드
		//리스트로 변환해야 하는 배열이 있는 경우 Arrays.asList()를 사용합니다.
		//asList()메서드는 가변 개수의 인수를 갖도록 되었습니다.
		//배열을 전달하는 대신 개별 요소를 전달할 수도 있습니다.
		//Array.asList는 new ArrayList()을 대신해서 간편하게 만들어 주는
		//메소드입니다.
		
		//정렬 이전 출력
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//정렬
		Collections.sort(list);
		//정렬 이후 출력 - 문자의 정렬은 사전 편찬 순으로 정렬됩니다.
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//검색, 찾기
		//public static int binarySearch(List<E> list, T key)
		//list에서 key를 찾아 그 인덱스 값 반환, 못 찾으면 음의 정수 반환
		
		//검색을 하기 전에 주의해야 할 점은 정렬이 먼저입니다.
		//binarySearch()메소드는 리소스를 절약하기 위해서 정렬이 되어 있다고
		//생각하고 오름차순으로 검색을 하다가 찾을려는 타겟의 범위가 초과하면 멈춘다.
		int idx=Collections.binarySearch(list, "Box");
		System.out.println(list.get(idx));
		int idx1=Collections.binarySearch(list, "Toy");
		System.out.println(list.get(idx1));
		
		//복사하기
		List<String> oldList=new ArrayList<String>(2);
		oldList.add("A");
		oldList.add("B");
		//얕은 복사(copy)
		List<String> copiedList=oldList;
		//깊은 복사(deep copy)
		//public static <T> void copy(List<T> dest,List<T> src)
		List<String> deepcopiedList=new ArrayList<>(oldList.size());
		Collections.copy(oldList, deepcopiedList);
		System.out.println("deepcopiedList");
		System.out.println(deepcopiedList);
		for(String s:deepcopiedList) {
			System.out.println(s);
		}
		//Create lists for source and destination      
        List<Integer> source = Arrays.asList(1,2,3,4);  
        List<Integer> dest = Arrays.asList(5,6,7,8,9,10);  
        Collections.copy(dest, source);  
        //Print the List  
	    for(Integer i : dest) {  
	    	System.out.print(i +" ");  
	    }  
    
	}

}