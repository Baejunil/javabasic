package c02;

import java.util.Scanner;

public class C02_04_02 {
	
	public static void main(String[] args) {
		//키보드에서 입력된 내용을 변수에 저장하기
		//Scanner 클래스
		Scanner scanner=new Scanner(System.in);
		//nextLine()메소드 엔터키가 입력되기 전까지 대기 상태가 되며,
		//엔터 키가 입력되면 입력된 모든 내용을 문자열로 읽습니다.
		System.out.print("문자열을 입력:");
		String inpoutStr=scanner.nextLine();
		System.out.println(inpoutStr);
	}
}
