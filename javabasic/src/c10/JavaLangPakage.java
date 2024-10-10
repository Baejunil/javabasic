package c10;

//java.lang 패키지
//java.lang 패키지는 자바 프로그램의 기본적인 클래스를 담고 있는 패키지입니다.
//그래서 java.lang 패키지에 있는 클래스와 인터페이스는 import 없이 사용할 수
//있습니다.
//지금까지 사용한 String과 System클래스도 java.lang 패키지에 포함되어 있기
//때문에 import하지 않고 사용했습니다.

//자바 API 도큐먼트
//API(Application Programing Interface)
//API는 라이브러리(liberary)라고 부르기도 하는데, 프로그램 개발에 자주 사용되는
//클래스 및 인터페이스의 모음을 말합니다.
//방대한 자바 표준 API 중에서 우리가 원하는 API를 쉽게 찾아 이용할 수 있도록
//도와주는 API도큐먼트가 있습니다.
//https://docs.oracle.com/en/java/javase/index.html
//https://docs.oracle.com/javase/8/docs/api/index.html

//Object 클래스
//클래스를 선언할 때 extends 키워드로 다른 클래스를 상속하지 않더라도
//암시적으로 java.lang.Object클래스를 상속하게 됩니다.
//따라서 자바의 모든 클래스는 Object 클래스의 자식이거나 자손 클래스입니다.
//Object는 자바의 최상위 부모 클래스에 해당합니다.

//Object 클래스는 필드가 없고, 생성자와 메소드로 구성되어 있습니다.
//모든 클래스의 최상위 부모가 Object이므로 모든 클래스에서 Object의 메소드를
//사용할 수 있습니다.

//객체 비교(equals())
//public boolean equals(Object obj){...}
public class JavaLangPakage {
	private String name;

	public JavaLangPakage(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		JavaLangPakage jlp1=new JavaLangPakage("Object");
		JavaLangPakage jlp2=new JavaLangPakage("Object");
		if(jlp1.name==jlp2.name) {
			System.out.println(jlp1.name+"=="+jlp2.name);
		}else {
			System.out.println(jlp1.name+"!="+jlp2.name);
		}
		//문자열이 동일한지 조사합니다
		if(jlp1.equals(jlp2)) {
			System.out.println(jlp1+"=="+jlp2);
		}else {
			System.out.println(jlp1+"!="+jlp2);
		}
		//기준 객체와 동일한 객체인지 비교를 합니다.
	
	
	//객체 해시코드(haseCode())
	//객체 해시코드란 객체를 식별하는 하나의 정수값을 말합니다
	//Object클래스의 hashCode()메소드는 객체의 메모리 번지를 이용해서
	//해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 가지고 있습니다.
	System.out.println(jlp1.hashCode());
	
	//객체 문자 정보(toString())
	//Object 클래스의 toString()메소드는 객체의 문자 정보를 리턴합니다.
	//객체의 문자 정보란 객체를 문자열로 표현한 값을 말합니다.
	//기본적으로 Object클래스의 toString()메소드는
	//'클래스 이름@16진수해시코드'로 구성된 문자 정보를 리턴합니다
	System.out.println(jlp1);
	System.out.println(jlp1.toString());
	}
}