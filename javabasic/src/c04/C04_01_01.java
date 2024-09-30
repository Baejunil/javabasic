package c04;

public class C04_01_01 {
	public static void main(String[] args) {
		//if문
		/*
		 * if(조건식){
		 * 	조건식이 true면
		 * {}불록에 있는 실행문이 실행 됩니다
		 * }
		 * 실행문B
		 * 조건식이 true이면 실행문A->실행문B 실행
		 * 조건식이 false이면 실맹문 B실행
		 */
		
		//int score=90;
		if(true) {}
		if(false) {}
		boolean b1=true;
		if(b1) {}
		boolean b2=false;
		if(b2) {}
		if(10>2) {}
		if(10==9) {}
		if(10<9&&9<0) {}
		if(10<9||9<0) {}
		//조건식에는 true 또는 false 값을 산출할 수 있는 연산식이나,
		//boolean 타입 변수가 올 수 있습니다.
		int score=93;
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		}
		int score1=88;
		if(score1>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		}
		System.out.println("프로그램 종료");
	
	}
	
}
