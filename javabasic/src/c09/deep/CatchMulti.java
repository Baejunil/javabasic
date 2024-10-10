package c09.deep;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외 종류에 따른 처리 코드
//예외의 종류에 따라 예외 처리 코드를 다르게 작성하는 방법

//다중 catch
//try 블록 내부는 다양한 예외가 발생할 수 있습니다. 예외별로 예외 처리 코드를
//다르게 하려면 다중 catch출록을 작성하는 것입니다.
public class CatchMulti {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			String[] strs= {"안녕","Hello","こんにちは "};
			System.out.println("인사를 선택하세요");
			System.out.println("1.한국어 2.미국어 3.일본어");
			System.out.print("선택:");
			int selected=sc.nextInt();
			System.out.println(strs[selected-1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("범위를 넘어선 접근입니다.");
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		}
		//catch 블록의 예외 클래스 타입은 try블록에서 발생된 예외의 종류를
		//말하는데, try블록에서 해당 타입의 예외가 발생하면 catch블록을
		//실행하도록 되어 있습니다.
		//catch 블록이 여러 개라 할지라도 단 하나의 catch 블록만 실행됩니다.
		//try블록에서 하나의 에외가 발생하면 즉시 실행을 멈추고 해당 catch블록으로
		//이동합니다.
		
	}
}
