package c05;

//상수(constants)
// - 변수에 값을 딱 한 번만 할당할 수 있으면 그것은 상수
// - 한 번 할당된 값은 변경이 불가능 하다
// - 키워드 final 선언이 붙어있는 변수

// final 기반의 상수 선언의 예
// - 상수의 이름은 모두 대문자로 짓는 것이 관례
// - 이름이 둘 이상의 단어로 이뤄질 경우 단어를 언더바로 연결하는 것이 관례
public class C05_02_01 {

	public static void main(String[] args) {
		//final 상수 선언의 예
		final int MAX_SIZE=100;
		final char CONST_CHAR='상';
		final int CONST_ASSIGNED;
		
		//할당하지 않았던 상수의 값 할당
		CONST_ASSIGNED=12;
		System.out.println("상수1: "+MAX_SIZE);
		System.out.println("상수2: "+CONST_CHAR);
		System.out.println("상수3: "+CONST_ASSIGNED);
		
		//상수는 한 번 할당된 값은 변경이 불가능 하다
		int num=0;
		num=12;
		int num1=1;
		num=num1;
		final int num2=2;
		//num2=12; //상수는 값 변경이 불가
		//num2=num1;
		
		final int num3;
		num3=3;
//		num3=4;
	}

}