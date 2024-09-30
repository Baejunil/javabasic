package c02;

//변수와 시스템 입출력
public class C02_04_01 {
	public static void main(String[] args) {
		System.out.println("출력 내용");
		//모니터로 변수값 출력하기
		//println()메소드의 괄호 ()안에 리터럴이 그대로 출력되고,
		//변수를 넣으면 변수에 저장된 값이 출력되었습니다.
		//println() ln은 line의 줄임말로 행을 바구라는 의미입니다.
		System.out.println("출력 내용1");
		System.out.println("출력 내용2");
		System.out.print("출력 내용3");
		System.out.print("출력 내용4");
		System.out.print("\n");
		System.out.print("출력 내용5\n");
		System.out.print("출력 내용6");
		System.out.println();
		//메소드|의미
		//println(내용);|괄호 안의 내용을 출력하고 행을 바꿔라
		//print(내용);|괄호 안의 내용을 출력만 해라
		//printf("형식문자열",값1,값2,.....)|
		//괄호 안의 첫 번째 문자열 형식대로 내용을 출력해라
		System.out.printf("이름:%s","배자바");
		System.out.println();
		System.out.printf("나이:%d",25);
		System.out.println();
		System.out.printf("이름:%s나이:%d","배자바",25);
		//정수 %d, 실수 %f, 문자열 %s
		
		
	}
}
