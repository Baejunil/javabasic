package c06;

//메소드 오버로딩
//클래스 내에같은 이름의 메소드를 여러개 선언하는 것을
//메소드 오버로딩이라고 합니다.
//메소드 오버로딩의 조건은 매개변수의 타입,개수,순서 중 하나가 달라야 한다
public class MethodOverloading {
	//메소드 오버로딩이 필요한 이유는 매개값을 다양하게 받아 처리 할 수 있도록 하기 위해서 입니다
	int plus(int x,int y) {
		return x+y;
	}
	double plus(double x,double y) {
		return x+y;
	}	
	//매개 변수의 타입과 개수, 순서가 똑같을 경우
	//매개 변수 이름이 다르다고 해서 이것을 메소드 오버로딩이라고 하지 않는다
	//리턴 타입만 다른것도 메소드 오버로딩이 아니다
	//double plus(double xx,double yy) {
		//return xx+yy;
//	}
	public static void main(String[] args) {
		System.out.println(3);
		System.out.println("문자열");
		MethodOverloading mo=new MethodOverloading();
		mo.plus(10, 42);
		mo.plus(10.0,4.5);
		//일차적으로 매개 변수의 타입을 본다
		mo.plus(10, 20);	
		}
}
