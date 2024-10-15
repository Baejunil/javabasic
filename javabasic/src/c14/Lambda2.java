package c14;

public class Lambda2 {
	public static void main(String[] args) {
		Printable prn=new Printable() {
			
			@Override
			public void print(String s) {
				System.out.println("익명 클래스");
				System.out.println(s);
			}
		};
		//prn이 Printable형 참조변수이니 =의 왼편에는 new가 당연히 올 것이고,
		//메소드 정의가 온 것을 보니, 익명 클래스를 기반으로 보건대 이는
		//인스턴스 생성이다.
		/*
		Printable prn=
			@Override
			public void print(String s) {
				System.out.println("익명 클래스");
				System.out.println(s);
			};
		*/
		//Printable 인터페이스에 있는 메소드 그거 
		//public void print(String s)는 뻔하다
		/*
		 Printable prn=
			{
				System.out.println("익명 클래스");
				System.out.println(s);
			};
		
		*/
		//람다식의 인자 전달
		Printable prn1=(s)->{
			System.out.println("람다");
			System.out.println(s);
		};
		prn.print("This is Lambda");
		prn1.print("This is Lambda");
		
	}

}