package c02;

public class C02_02_02 {

	public static void main(String[] args) {
		//char타입
		//하나의 문자를 작은따음표(')로 감싼 것을 문자로 리터럴 이라고 합니다
		//문자 리터럴은 유니코드(unicode)로 변환되어 저장
		//유니코드는 세계국가의 문자를 2byte로 표현할수있는
		//숫자(0~65535)로 매핑한 국제 표준조약
		char varl='A';
		char c=65;
		System.out.println(varl);
		System.out.println(c);
		//String 타입
		//자바에서 큰따음표(")로 감싼 문자들은 문자열이라고 부릅니다
		String str1="A";
		String str2="foo bar";
	//	String str2='foo bar';
		//String타입은 기본 타입이 아닙니다.
		//String은 클래스 타입입니다
	
		//큰따음표(")는 문자열 식별 기호인데,
		//데이터로서 큰따음표를 사용하고 싶은 경우
		//철수가 말했다. "안녕"
		//System.out.println("철수가말했다, "안녕"");	
		//문자열 내부에 역슬래스가 붙은 문자를 사용할 수 있는데
		//이것을 이스케이트문자 라고한다
		//특정 문자를 포함시킬수 있다.
		System.out.println("철수가말했다, \"안녕\"");	
		//탭만큼 띄우기 -\T
		System.out.println("id\t| name");	
		System.out.println("i\t| name");	
		System.out.println("100\t| name");	
		//기행하기 -\n
		System.out.println("홍길동\n김자바");	
		System.out.println("역슬래시: \\");	
		//역슬래시 :\
	}

}
