package c02;

//타입 변환
//타입 변환이란 데이터 타입을 다른 데이터 타입으로 변환하는 것
//예를 들어 ,byte 타입을 int 타입을 변환하거나
//반대로 int 타입을 byte타입으로 변환하는 행위를 말한다
public class C02_03_01 {
	public static void main(String[] args) {
		// 두 변수의 타입이 동일한 경우,
		//한족 변수값을 다른 쪽 변수에 복사해서 저장할 수 있습니다
		int n1=42;
		int n2=n1;
		System.out.println(n2);
		
		byte a=10;
		int b=a;
		String c="10";
		//a=b;
		//b=c;
		// 만약 두 변수의 타입이 다를 때 복사해서 저장할려면
		//값의 저장이 가능할수도 있고 그렇지 안는수가 있습니다.
		
		//자동 타입 변환
		//자동 타입 변환은 값의 허용 범위가 작은 타입이
		//허용 범위가 큰 타입으로 저장될 때 발생합니다.
		//기본 타입을 허용 범위 크기순으로 정리
		//byte<short<int<long<float<double
		byte byteValue=10;
		int intvalie=byteValue;
		//int i1="aa";
		//int i2=3.14;
		long longValue=50000000000L;
		float floatValue=longValue;
		double doublevalue=longValue; 
	
		//강제 타입 변환
		//강제 타입 변환은 캐스팅 연산자 괄호()를 사용
		int i3=10;
		byte b3=(byte)i3;
		int i4=1000;
		byte b4=(byte)i4;
		System.out.println(b4);
		//담을수 없는 크기에 닶을 강제 변환하면 논리 에러가 발생되나.
		
		long l5=500;
		int i5=(int) l5;
		System.out.println(i5);
		
		double d6=3.14;
		int i6=(int) d6;
		System.out.println(i6);
		//실수 타입은 정수 타입으로 강제 타입 변환을 사용하면
		//소수점 이하 부분은 버려지고, 정수 부분만 저장됩니다.
		
		//정수 연산에서의 자동 타입 변환
		//byte, short타입의 변수는 int 타입으로
		//자동 타입 변환되어 연산을 수행합니다.
		//사칙 연산자 + - * /
		byte b1=10;
		byte b2=20;
	//  byte b3=b1+b2;
		int ii3=b1+b2;
		byte bb3=(byte)(b1+b2);// byte 으로 하면 초과가 되기때문에 int로 해야 값이나옴아님 강제변환해야함
		System.out.println(ii3);
		System.out.println(bb3);
		//두 피연산자 중 허용 범위가 큰 타입으로 변호나되어 연산을 수행합니다.
		byte v1=10;
		int v2=100;
		long v3=1000;
		long result=v1+v2+v3;
		System.out.println(result);
	
	}
}
