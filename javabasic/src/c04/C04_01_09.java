package c04;

import java.util.Scanner;

public class C04_01_09 {

	public static void main(String[] args) {
		boolean run=true;
		Scanner scanner=new Scanner(System.in);
		while(run) {
			System.out.println("********************");
			System.out.println("0.종료|1.인사하기");
			System.out.println("********************");
			System.out.print("선택>");
			String choicedNumber=scanner.nextLine();
			System.out.println();
			switch(choicedNumber) {
				case "0":
					run=false;
					break;
				case "1":
					System.out.println("안녕하세요.");
					break;
				default:
					System.out.println("잘못 된 선택입니다.");
			}
		}
		System.out.println("프로그램 종료.");
	}

}