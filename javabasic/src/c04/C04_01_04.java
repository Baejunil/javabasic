package c04;

public class C04_01_04 {

	public static void main(String[] args) {
		// else if문
		//
		/*
		 * if(조건식1){
		 * //조건식1이 true
		 * 실행문A
		 * }else if(조건식2){
		 * // 조건식2가 true
		 *  실행문B
		 * }else{
		 *  실행문c
		 * }
		 * 실행문D
		 * 1. 조건식1이 true이면 실행문 A->실행문D실행
		 * 2. 조건식1이 false이면 조건식2로 이동
		 * 3. 조건식2가 true이면 실행문B->실행문D실행
		 * 4. 조건식2가 false이면 실행문C->실행문D 실행
		 * 
		 */
		int score=75;
		if(score>=90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급은 A입니다");
		}else if(score>=80) {
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B입니다");
		}else if(score>=70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C입니다");
		}else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다");
		}
		//else {}블록은 생략이 가능하다
		
		//하나의 조건식이 true 가되면 if문 전체가 끝난다
		//잘못 된예
		 int score2=60;
		  if(score2<90){
		 	 System.out.println("90점 미만입니다");		
		  }else if(score2<80){
		 	System.out.println("80점 미만입니다");
		 }
         
		// 불필요한 예
		//논리연산자로 가독성이 떨어지게 하지말자
		if(score<100&&score>=90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급은 A입니다");
		}else if(score<90&&score>=80) {
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B입니다");
		}else if(score<80&&score>=70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C입니다");
		}else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다");
		}
	}

}
