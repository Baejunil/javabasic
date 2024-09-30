package c02;

//클래스 이름 - 대문자로 시작
//변수 이름 - 소문자로 시작 -관례
public class C02_01_02 {
	public static void main(String [] args) {
		int primaryNumber;
		//변수 복사
		//변수는 또 다른 변수에 대입하여 값을 복사 할 수 있다
		//변수 x 값을 변수 y값으로 복사합니다
		int x=10;
		int y=x;
		System.out.println(x);
		System.out.println(y);
		
		//변수 값 교환
		int n1=3;
		int n2=5;
		System.out.println("n1: "+n1+", n2: "+n2);
		//n1 값과 n2 값을 교환한다
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("n1: "+n1+", n2: "+n2);
		
	}
}
