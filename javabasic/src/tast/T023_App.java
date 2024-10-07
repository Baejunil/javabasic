package tast;

import java.util.Scanner;

public class T023_App {
	public static void main(String[] args) {
		Scanner gc=new Scanner(System.in);
		T023_LIstR glr=new T023_LIstR();
		while(true) {
			System.out.println("0.종료 1. pc게임 2. 모바일게임 3.게임보기");
			System.out.println("선택:");
			int choise=gc.nextInt();
			gc.nextLine();
			switch (choise) {
			case 0:
				 gc.close(); // Scanner 닫기
				 System.out.println("종료되었습니다");
				return;
			case 1:
				System.out.println("pc게임:");
				String name=gc.nextLine();
				T023_List gl=new T023_0pc();
				gl.setName(name);
				glr.createGL(gl);
				System.out.println(name+"게임이 등록되었습니다");
				break;
			case 2:
				System.out.println("모바일게임:");
				String name1=gc.nextLine();
				T023_List gl1=new T023_0pc();
				gl1.setName(name1);
				glr.createGL(gl1);
				System.out.println(name1+"게임이 등록되었습니다");
				break;
			case 3:
				glr.pringGLs();
				break;
			}
		}
	}
}
