package c03;

public class C03_01_05 {

	public static void main(String[] args) {
		//삼항 연산자
				//조건식 ? 값 또는 연산식(피연산자1) : 값 또는 연산식(피연산자2)
				//조건식을 연산하여 true가 나오면 피연산자1이 결과값이 된다.
				//조건식을 연산하여 false가 나오면 피연산자2가 결과값이 된다.
				
				//60점 이상일 때 pass, 아니면 fail이라는 문자열을 저장하세요
				int score=95;
				String result;
				if(score>=60) {
					result="pass";
				}else {
					result="fail";
				}
				System.out.println(result);
				
				String r2=score>=60?"pass":"fail";
				System.out.println(r2);
	}

}
