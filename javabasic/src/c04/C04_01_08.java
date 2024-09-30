package c04;

public class C04_01_08 {

	public static void main(String[] args) {
		//while문
		//for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true일 경우에
		//계속해서 반복합니다.
		/*
		 * while(조건식){
		 * 	//조건식이 true일 경우
		 * 	실행문
		 * }
		 */
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//1부터 100까지 합을 출력
		//합계를 저장할 변수
		int sum=0;
		//루프 카운터 변수
		int countCheck=1;
		while(countCheck<=100) {
			sum+=countCheck;
			countCheck++;
		}
		System.out.println("1~100까지의 합: "+sum);
	}
}
