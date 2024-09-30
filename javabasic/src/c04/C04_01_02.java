package c04;

public class C04_01_02 {

	public static void main(String[] args) {
		System.out.println("프로그램시작");
		int score=55;
		
		if(score>=60) {
			System.out.println("합격");
		}
		//중괄호 {}불록은 여러 개의 실행문을 하나로 묶기 위해 작성됩니다.
		//만약 실행해야 할 문장이 하나밖에 없다면 생략할 수 있습니다. 
		if(score<60) 
			System.out.println("불합격");
		//if문과는 아무런 관련이 없는 실행문
		System.out.println("조금더 분발하시오");
		if(score<60) { 
			System.out.println("불합격");
			System.out.println("조금더 분발하시오");
		}
		System.out.println("프로그램종료");
	}

}
