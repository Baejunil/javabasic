package c11.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map 컬렉션
//Map 컬렉션은 키(key)와 값(value)으로 구성된 Map.Entry객체를 저장하는 구조를
//가지고 있습니다.
//Entry는 Map인터페이스 내부에 선언된 중첩 인터페이스입니다.
//여기서 키와 값은 모두 객체입니다.
//키는 중복 저장될 수 없지만 값은 중복 저장될 수 있습니다.
//만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고
//새로운 값으로 대체됩니다.
//Map 컬렉션에서는 HashMap, Hashtable, LinkedHashMap, Properies,
//TreeMap등이 있습니다.
//Map 인터페이스의 메소드
//메소드 | 설명
//V put(K key, V value) | 주어진 키로 값을 저장합니다. 
//boolean containsKey(Object key) | 주어진 키가 있는지 여부를 확인합니다.
//boolean containsValue(Object value) | 주어진 값이 있는 여부를 확인합니다.
//Set<Map.Entry<K,V>> entrySet() | 키와 값의 쌍으로 구성된 모든 Map.Entry
//객체를 Set에 담아서 리턴합니다.
//V get(Object key) | 주어진 키가 있는 값을 리턴합니다.
//boolean isEmpty() | 컬렉션이 비어 있는 여부를 확인합니다.
//Set<K> keySet() | 모든 키를 Set객체에 담아서 리턴합니다.
//int size() | 저장된 키의 총 수를 리턴합니다.
//void clear() | 모든 키와 값을 삭제합니다.
//V remove(Object key) | 주어진 키와 일치하는 Map.Entry를 삭제하고 값을
//리턴합니다.
public class HashMapExample {
	public static void main(String[] args) {
		//HashMap
		//HashMap은 Map 인터페이스를 구현한 대표적인 Map컬렉션입니다.
		
		//Map 컬렉션 생성
		Map<String, Integer> map=new HashMap<String,Integer>();
		//Map<String, Integer>로 map 변수를 선언하였습니다.
		//이것은 Map컬렉션에 저장되는 키 객체는 String타입으로,
		//값 객체의 Integer타입으로 하겠다는 뜻입니다.
		
		//객체 저장
		map.put("신자바", 85);
		map.put("홍길동", 90);
		map.put("동장군", 95);
		System.out.println("총 Entry 수: "+map.size());
		//홍길동 키가 같기 때문에 값이 대체 된다.
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: "+map.size());
		
		//객체 찾기
		System.out.println("홍길동 키의 값: "+map.get("홍길동"));
		
		//저장된 전체 객체를 대상으로 하나씩 얻고 싶을 경우
		//1. 첫번째는 keySet()메소드로 모든 키를 Set 컬렉션으로 얻은 다음,
		//반복자를 통해 키를 하나씩 얻고 get()메소드를 통해 값을 얻는 방법입니다.
		Set<String> keySet=map.keySet();
		Iterator<String> keyInterator=keySet.iterator();
		while(keyInterator.hasNext()) {
			String key=keyInterator.next();
			System.out.println("키: "+key);
			System.out.println("값: "+map.get(key));
		}
		//2. 두 번째는 entrySet()메소드로 모든 Map.entry를 Set컬렉션으로 얻은
		//다음, 반복자를 통해 Map.Entry를 하나씩 얻고 getKey()와
		//getValue()메소드를 이용해 키와 값을 얻는 방법입니다.
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator
			=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(key+" : "+value);
		}
		
		//객체 삭제
		map.remove("홍길동");
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: "+map.size());
	}
}