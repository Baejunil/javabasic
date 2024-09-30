package c02;

public class C02_02_03 {
	public static void main(String[] args) {
		//실수 타입
		//소수점이 있는 수를 실수라고 한다
		//타입|메모리 사용크기
		//float|4byte
		//double|8byte
		
		//실수 리터럴
		//소수점이 있는 숫자는 10진수를 실수로 인식합니다
		double d1=0.25;
		double d2=-3.14;
		//d2="str";
		//지수와 가수로 표현된 소수점이 있는 10진수 실수로 인식
		double d3=5e2;
		double d4=0.12E-2;
		//자바는 실수 리터럴을 기본적으로 double 타입으로
		//해석하기 때문에 double 타입 변수에 저장해야합니다
		//float f=3.14;
		//float 타입으로 저장하고 싶다면 리터럴 뒤에 소문자 f나
		//대문자 F를 붙여 컴파일러가 float타입임을 알수 있도록 해야 합니다.
		float f1=3.14f;
		float f2=3.14F;
		//실수는 연산을 할대 오차가 발생된다.
		//그래서 float와 double은 정밀도의 차이가 있다.
		double d5=0.1;
		double temp=0;
		for(int i=0;i<=10;i++) {
			temp=temp+d5;
		}
		System.out.println(temp);
	}
}
