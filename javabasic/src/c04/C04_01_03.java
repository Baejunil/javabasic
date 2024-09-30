package c04;

public class C04_01_03 {
	public static void main(String[] args) {
		//if-else문
		/*
		 * if(조건식){
		 * //조건식이 true
		 * 실행문A
		 * }else{
		 * 	//조건식이 false
		 * 	실행문B
		 *}
		 *실행문 C
		 *1. 조건식이 true이면 실행문A->실행문C 실행
		 *2. 조건식이 false이면 실행문B->실행문C 실행
		 */
		int score=90;
		
		if(score>=60) {
			System.out.println("점수가 60보다 큽니다");
			System.out.println("합격입니다.");
			int a=0;
			int b=a+score;
		}else {
			System.out.println("점수가 60보다 작습니다");
			System.out.println("불합격입니다.");
		}
		int score1=40;
		
		if(score1>=60) {
			System.out.println("점수가 60보다 큽니다");
			System.out.println("합격입니다.");
			int a=0;
			int b=a+score1;
		}else {
			System.out.println("점수가 60보다 작습니다");
			System.out.println("불합격입니다.");
		}
		//if문이 else블록과 함께 사용되어 조건식의 결과에 따라
		//실행 블록을선택합니다
		//if문의 조건식이 true이면 if문의 블록이 실행되고,
		//조건식이 false이면 else블록이 실행됩니다.
		
		
	}
}
