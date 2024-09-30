package c02;

public class C02_03_02 {
	public static void main(String[] args) {
		//실수 연산에서의 자동 타입 변환
		//두 피연산자가 동일한 타입이라면 해당 타입으로 연산
		//피연산다 중 하나가 double타입이라면
		//다른 피연산자도 double타입으로 자동 타입 변환되어 연산
		double result =1.2f+3.4;
		//int 타입과 double타입을 연산해도 double타입으로
		//자동 변환되고 연산을 수행합니다.
		int intValue=10;
		double doubleValue=5.5;
		double resultl=intValue+doubleValue;
		
		int x=1;
		int y=2;
		double result3=x/y;
		System.out.println(result3);
		//자바에서 정수 연산의 겨로가는 정수가 된다
		double result4=(double)x/y;
		System.out.println(result4);
		
		double result5=x/(double)y;
		System.out.println(result5);
		
		double result6=(double)x/(double)y;
		System.out.println(result6);
		
		//+ 연산에서의 문자열 자동 타입 변환
		//자바에서 +연산자는 두 가지 기능을 가지고 있습니다.
		//피연산자가 모두 숫자일 경우에는 덧셈 연산을 수행
		//피연산자 중 하나가 문자열일 경우에는 나머지 피연산자도
		//문자열로 자동 변환되어 문자열 결합 연산을 수행합니다.
		//숫자+숫자 -> 덧셈 연산 -> 숫자
		//"문자열"+숫자 or 숫자+"문자열" -> 결합 연산 => "문자열 숫자"
		//=>"숫자문자열"
		int v1=3+7;
		String s1="3"+7;
		System.out.println(s1);
		String s2=1+"2"+3+4+5;
		//=>"12"+3
		String s3=1+2+"3";
		
		//특정 부분을 우선 연산하고 싶을 경우
		int i1=2+3*8;
		System.out.println(i1);
		int i2=(2+3)*8;
		System.out.println(i2);
		//우선 연산하고 싶은 부분이 있다면 해당 부분을 괄호로 감싸
		//괄호는 최우선으로 연산 수행
		String s4="1"+(2+3);
		System.out.println(s4);
		
		//문자열을 기본 타입으로 강제 타입 변환
		String s5="42";
		int i3=Integer.parseInt(s5);
		
		//문자열이 숫자가 아닌 알파벳이나 특수 문자, 한글 등을
		//포함하고 있을 경우 숫자 타입으로 변환을 시도하면
		//예외(에러)가 발생한다.
		
		String s6="42a";
		//int i4=Integer.parseInt(s6);
		
		//반대로 기본 타입의 값을 문자열로 변경하는 경우
		String s7=String.valueOf(3);
		System.out.println(s7);
		
	}
}
