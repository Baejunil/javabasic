package c09.deep;

import java.util.InputMismatchException;
import java.util.Scanner;

//catch순서
//다중 catch 블록을 작성할 떄 죽의할 점은 상위 예외 클래스가 하위 예외 클래스보다
//아래쪽에 위치해야 한다는 것입니다
//try블록에서 예외가 발생했을때 예외를 처리해줄 catch블록은 위에서 부터
//차례대로 검색됩니다.
//만약 상위 예외클래스의 catch블록이 위에 있다면,하위 예외 클래스의 catch블록은
//실행되지 않습니다.
//하위 에외는 상위 예외를 상속했지 때문에 상우 예외 타입도 되기 때문입니다.
public class Catchteps {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			String[] strs= {"안녕","Hello","こんにちは "};
			System.out.println("인사를 선택하세요");
			System.out.println("1.한국어 2.미국어 3.일본어");
			System.out.print("선택:");
			int selected=sc.nextInt();
			System.out.println(strs[selected-1]);
		//}catch(Exception e) {
	//	System.out.println("잘못됨");	//(x)
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("범위를 넘어선 접근입니다.");
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		}catch(Exception e) {
			System.out.println("무언가 잘못되었습니다");
		}
		//모든 예외클래스는 Exception을 상속받기 때문에 첫 번째 catch블록만
		//선택되어 실행됩니다.
		//두 번째이후 catch블록은 어떤 경우라도 실행되지 않습니다
}
}