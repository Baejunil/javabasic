package javabasic;

//실행문과 세미콜론(;)
//블록 내부에는 다양한 실행문들이 작성됩니다.
//실행문 끝에는 반드시 세미콜론(;)을 붙여서 실행문이 끝났음을
//표시해주어야 하며, 그렇지 않으면 컴파일 에러가 발생합니다.
public class C01_03_04 {

	public static void main(String[] args) {
		System.out.println("Hello, Java");
		// 변수 x 선언
		int x;
		//변수 x에 1을 저장
		x=1;
		//변수 y를 선언하고 2를 저장
		int y=2;
		//변수 result를 선언하고 변수  x와 y를 더한 값을 저장
		int result=x+y;
		//println 메소드호출
		System.out.println(result);
		
		// 하나의 실행문을 여러 줄에 걸쳐서 작성
		int result1= x+y;
		int result2=
				x+y;
		//한 줄에 여러가지 실행문을 작성할 수도 있습니다
		int n1=1; int n2=2;
		// 컴파일 에러는 없으나 가독성이 떨어 지기 때문에 사용 자제 한다
	}

}
