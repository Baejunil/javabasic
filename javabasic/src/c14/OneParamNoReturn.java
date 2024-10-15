package c14;

public class OneParamNoReturn {
	public static void main(String[] args) {
		//Simple is better than complex
		//매개 변수가 있고 반환하지 않는 람다식
		Printable p;
		//줄임 없는 표현
		p=(String s)->{System.out.println(s);};
		//메소드 {}블록의 코드가 한줄이면 중괄호 생략
		p=(String s)->System.out.println(s);
		//매개변수 형 생략
		p=(s)->System.out.println(s);
		//매개변수가 한개 일 때는 매개변수 소괄호 생략
		p=s->System.out.println(s);
	}

}