package c03;

public class C03_01_02 {
	public static void main(String[] args) {
	//이항 연산자
			//피연산자가 2개인 연산자
			//산술 연산자, 문자열 결합 연산자, 비교 연산자, 논리 연산자,대입 연산자
				
			//산술 연산자
			// 연산식|설명
			// +|덧셈 연산
			// -|뺄셈 연산
			// *|곱센 연산
			// /|나눗셈 연산
			// %|나눈 나머지를 구하는 연산
				
			int num1=10;
			int result1=num1%3;
			System.out.println(result1);
			int result2=num1/3;
			System.out.println(result2);
			
			//산술 연산자는 피연산자들의 타입이 동일하지 않을 경우
			//피연산다들의 타입을 이치 시킨 후 연산을 수항한다
			//1. byte,short, char 타입일 경우
			//모두 int타임으로 변환된 후에 연산을 수행합니다.
			//2. 피연산자들이 모두 정수 타입이고 long타입이 포함되어 있을 경우,
			//모두 long 타입으로 변환된 후 연산을 수행합니다.
			//3. 피연산자 중 실수 타입(float, double)이 있을경우,
			//허용 범위가 큰 실수 타입으로 변환된후 연산을 수행
			int v1=5;
			int v2=2;
			
			int r1=v1+v2;
			System.out.println(r1);
			
			int r2=v1-v2;
			System.out.println(r2);
			
			int r3=v1*v2;
			System.out.println(r3);
			
			int r4=v1/v2;
			System.out.println(r4);
			
			int r5=v1%v2;
			System.out.println(r5);
			
			double r6=(double)v1/v2;
			System.out.println(r6);
			
			//char타입의 산술 연산
			
			System.out.println();;
	       
	}
}
