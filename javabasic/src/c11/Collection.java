package c11;

import java.util.ArrayList;
import java.util.List;

//컬렉션 프레임워크
//배열은 기본 타입뿐만 아니라 클래스 타입의 배열도 만들 수 있기 때문에
//객체 저장소로 사용될 수 있습니다.
//하지만 배열은 선언 시 정한 크기(저장 용량)를 변경할 수 없고, 항목을 저장, 삭제
//추가하는 메소드가 없기 때문에 직접 인덱스를 사용해야 합니다.
//이러한 불편함을 해결 하기 위해 자바는 컬렉션 프레임워크를 제공합니다.
//자바는 널리 알려져 있는 자료구조를 사용해서 객체들을 효율적으로 추가, 삭제,
//검색할 수 있도룩 인터페이스와 구현 클래스를 java.util 패키지에서 제공합니다.
//이들을 총칭해서 컬렉션 프레임워크라고 부릅니다
//컬렉션 프레임워크의 주요 인터페이스로는 List, Set, Map이 있습니다.
public class Collection {
	//List 컬렉션
	//List 컬렉션은 배열과 비슷하게 객체를 인덱스로 관리합니다. 배열과의 차이점은
	//저장 용량이 자동으로 증가하며, 객체를 저장할 때 자동 인덱스가 부여된다는
	//것입니다.
	//그리고 추가, 삭제, 검색을 위한 다양한 메소드들이 제공됩니다.
	//동일한 객체를 종복 저장할 수 있고, null도 저장이 가능합니다.
	//List 컬렉션에는 Arraylist, LinkedList
	//Vector(1.3버전 이후로는 쓰지 않습니다.) 등이 있다
	//ArrayList<E> 참조변수이름= new ArrayList()<E>;
	//List 인터페이스의 메소드
	//boolean add(E e)- 주어진 객체를 맨 끝에 추가합니다.
	//E get(int index) - 주어진 인덱스에 저장된 객체를 리턴합니다.
	//메소드의 매개 변수 타입과 리턴 타입에 E라는 타입 파라미터가 있는데
	//이것은 저장되는 객체의 타입을 List 컬렉션을 생성할 때 결정하라는 뜻입니다.
	public static void main(String[] args) {
		//
		ArrayList<String> strList=new ArrayList<String>();
		//List<String>으로 list변수를 선언 하였습니다. 이것은 List컬렉션에
		//저장되는 객체를 String 타입으로 하겠다는 뜻입니다.
		//따라서 E 타입 파라미터는 String타입이 되는 것입니다.
		//그래서 add()메소드의 매개값은 문자열이 되고 get()메소드의 리턴값은 문자열이
		//됩니다
		List<String> list=new ArrayList<String>();
		list.add("홍길동");
		String s1=list.get(0);
		
		//foreach문 사용
		for(String s:list) {
			System.out.println(s);
		}
	}
}
