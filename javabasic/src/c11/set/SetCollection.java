package c11.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 컬렉션
//List 컬렉션은 객체의 저장 순서를 유지하지만, Set 컬렉션은 저장 순서가 유지되지
//않습니다. 또한 객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있습니다.
//Set 컬렉션은 수학의 집합과 비슷합니다.
//집합은 순서와 상관없고 중복이 허용되지 않기 때문이다.
//Set 컬렉션은 HashSet, LinkedHasjSet, TreeSet등이 있다.
//인덱스로 관리 하지 않기 때문에 인덱스를 매개값으로 갖는 메소드가 없습니다.

//Set 인터페이스의 메소드
//메소드 | 설명
//boolean add(E e) | 주어진 객체를 저장합니다. 객체가 성공적으로 저장되면 true를
//리턴하고 중복 객체면 false를 리턴합니다.
//boolean contains(object o) | 주어진 객체가 저장되어 있는지 조사합니다.
//boolean isEmpty() | 컬렉션이 비어 있는지 조사합니다.
//Iterator(E) iterator() | 저장된 객체를 한 번씩 가져오는 반복자를 리턴하빈다.
//int size() | 저장되어 있는 전체 객체 수를 리턴합니다.
//void clear() | 저장된 모든 객체를 삭제합니다.
//boolean remove(Object o) | 주어진 객체를 삭제합니다.
public class SetCollection {
	
	public static void main(String[] args) {
		//메소드의 매개 변수 타입과 리턴 타입에 E라는 타입 파라미터가 있는데,
		//이것은 저장되는 객체의 타입을 Set 컬렉션을 생성할 때 결정하라는 뜻입ㄴ디ㅏ.
		//Set<String>으로 set변수를 선언하였습니다.
		//이것은 Set 컬렉션에 저장되는 객체를 String타입으로 하겠다는 뜻입니다.
		//따라서 E타입 파라미터는 String타입이 되는 것입니다.
		//그래서 add()메소드와 remove()메소드의 매개값은 문자열이 됩니다.
		Set<String> set=new HashSet<>();
		set.add("Java");
		set.add("Javascript");
		set.add("Html5");
		set.add("Oracle");
		set.add("React");
		set.add("Spring");
		//Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없습니다.
		//대신, 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를
		//제공합니다,
		//반복자는 Iterator인터페이스를 구현한 객체를 말하는데,
		//iterator()메소드를 호출하면 얻을수 있습니다.
		for(String s:set) {
			System.out.println(s);
		}
		//foreacch보다 좀 더 세부 적인 코딩을 하기 위해서 iterator로 반복합니다.
		//java.util.Iterator로 임포트
		Iterator<String> iterator=set.iterator();
		//Iterator 인터페이스에 선언된 메소드
		//리턴 타입 | 메소드 | 설명
		//boolean | hasNext() | 가져올 객체가 있으면 trie를 리턴하고
		//없으면 false를 리턴합니다.
		//E | next() | 컬렉션에서 하나의 객체를 가져옵니다.
		//void | remove() | Set 컬렉션에서 객체를 제거합니다.
		while(iterator.hasNext()) {
			String str=iterator.next();
		}
		//Iterator에서 하나의 객체를 가져올 때는 next()메소드를 사용합니다.
		//hasNext()메소드는 가져올 객체가 있으면 true를 리턴하고 더 이상
		//가져올 객체가 없으면 false를 리턴하빈다.
		
		//Set 컬렉션에서 Iterator의 next()메소드로 가져온 객체를 제거하고
		//싶다면 remove()메소드를 호출하면 됩니다.
		//Iterator의 메소드 이지만, 실제 Set컬렉션에서 객체가 제거됨을 알아야
		//합니다
		while(iterator.hasNext()) {
			String str=iterator.next();
			if(str.equals("java")) {
				iterator.remove();
			}
		}
		System.out.println("-------");
		iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//HashSet
		//HasHSet은 Set인터페이스의 구현 클래스입니다. HashSet을 생성하기 위해
		//기본 생성자를 호출 햇습니다
		Set<Integer> set1=new HashSet<>();
		//Set,<E> - 타입 파라미터 E에는 컬렉션에 저장할 객체 타입을 ㅣㅈ저아혐ㄴ
		// 됩다
		//String 객체를 저장
		Set<String> set2=new HashSet<String>();
		Set<String> set3=new HashSet<>();
		//HashSet은 객체들을 순서 없이 저장하고 동일할 객체는 중복 저장하지
		//않스빈다/
		//HashSet이 판단하는 동일한 객체란 꼭 같은 인스턴스를 뜨하지 않흐빈다
		//HashSet객체를 저장하기 전에 먼저객체의 hashCode()메소드를
		//호출해서 해시코드를 얻어내고 이미저장되어 이쓴ㄴ 객체들의 해시코드와
		//비교합니다. 만약 동일한 해시코드가 있다면 equals()메소드로
		//두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장않스빈다
		
		//문자열을 HashSet에 저장할 경우에 같은 문자열 같ㅇ니 String객체는
		//동등한 ㅐㄱㄱ체로 간주되고 다른 문자열을 갖는 String 객체는 다른 개겣로
		//간주되는데, 그이유는 Strig클래스가 hashCode() equals()메소드를
		//재정의해서 같은 문자열일 경수hashcode() 의 리턴값은 같가ㅔ
		//equals()의 리턴값은 true가 나오도록 햇기대푼이ㅏㄷ
		
		}
	

}
