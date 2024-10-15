package c14;

//람다의 소개
public class Lambda1 {
	
	public static void main(String[] args) {
		//이름 있는 클래스
		Printer p=new Printer();
		Printable prn2=p;
		Printable prn3=new Printer();
		//익명 클래스
//		Printable prn=new Printable();
		Printable prn1=new Printable() {
			@Override
			public void print(String s) {
				System.out.println("printing...");
				System.out.println(s);
			}
		};
		prn1.print("What is Lambda?");
		
		//익명 클래스를 함축하는 대신 추상 메소드가 하나인 인터페이스에 대해서만
		//익명 클래스를 함축하는 람다를 사용할 수 있다.
		Printable prn=(s)->{System.out.println(s);};
		prn.print("What is Lambda?");
		
		//추상 메소드를 하나 가지고 있는 인터페이스를 구현하는 방법
		//1. class 생성해서 구현
		//2. 인터페이스형 참조 변수에 참조 시키는 순간에 익명 클래스 생성해서 구현
		//3. 인터페이스형 참조 변수에 참조 시킬때 람다로 추상 메소드 생성해서 구현
		
		
		
		
		
		
		
		
		
	}

}