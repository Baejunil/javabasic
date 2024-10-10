package c09.deep;

//Throwable 클래스
//java.lang.Throwable 클래스
//모든 예외 클래스의 최상위 클래스
//Throwable 클래스의 메소드 두가지
//public String getMessage(): 예외의 원인을 담고 있는 문자열을 변화
//public void printStackTrace(): 예외가 발생한 위치와 호출된 메소드의
//정보를 출력
public class ThrowableClass {
	public static void main(String[] args) {
		int[] ints= {1,2,3};
		try {
			System.out.println(ints[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("빠른 배열 인덱스를 입력하세요");
		}finally {
			System.out.println("try catch 블록 실행 끝");
		}
	}
}
