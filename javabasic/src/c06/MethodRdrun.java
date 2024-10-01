package c06;

import java.util.Scanner;

public class MethodRdrun {
	//리턴(return)문
	//리턴값이 있는 메소드
	//메소드 선언에 리턴 타입이 있는 메소드는 반드시 리턴문을 사용해서
	//리턴값을 지정해야 합니다.
	//만약 return문이 없다면 컴파일 에러가 발생합니다.
	//return문이 실행되면 메소드는 즉시 종료됩니다.
	
	//return 리턴값;
	
	//return문 리턴값은 리턴 타입이거나 리턴 타입으로 변환될 수 있어야 합니다.
	
	int plus(int x, int y) {
		return x+y;
//		int z=x+y+2;(X)
	}
	
	//조건문을 활용하면 Unreachable code에러를 발생 시키지 않고
	//return문 여러개 활용할 수 있다.
	boolean isGood(int good) {
		if(good==0) {
			System.out.println("안 죠습니다");
			return false;
		}
		System.out.println("죠습니다.");
		return true;
	}
	
	//리턴값이 없는 메소드:void
	//void로 선언된 메소드에서도 return문을 사용할 수 있습니다.
	//리턴값을 지정하는 것이 아니라 메소드 실행을 강제 종료시키는 역활을 합니다.
	//return;
	
	void divideWithZero(double a, double b) {
		if(b==0) {
			System.out.println("0으로 나누는 것은 불가합니다.");
			return;
		}
		double result=a/b;
		double rest=a%b;
		System.out.println("값: "+result);
		System.out.println("나머지: "+rest);
	}
	
	void getInt() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		System.out.print("입력: ");
		int choice=scanner.nextInt();
		System.out.println("당신이 입력한 수는 "+choice+"입니다.");
	}
	
	public static void main(String[] args) {
		MethodRdrun mr=new MethodRdrun();
		mr.isGood(0);
		mr.isGood(1);
		mr.divideWithZero(10, 2);
		mr.divideWithZero(9, 2);
		mr.divideWithZero(8, 0);
	}

}