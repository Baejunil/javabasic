package c06;

public class OverLoading {
	//생성자 오버로딩
	//생성자 오버로딩이란 매개 변수를 달리하여 생성자를 여러 개 선언하는 것을 말한다.
	//매개변수의 타입, 개수, 순서가 다르게 선언하는 것이다
	String model;
	String color;
	int maxSpeed;
	
	public OverLoading() {	
	}
	public OverLoading(String model) {	
	}
	public OverLoading(String model,String color) {	
	}
	public OverLoading(String model,String color,int maxSpeed) {	
	}
	public OverLoading(int maxSpeed) {		
	}
	public OverLoading(int maxSpeed,String model) {		
	}
	//매개 변수의 타입과 개수 그리고 선언된 순서가 똑같은 경우
	//매개 변수 이름만 바꾸는 것은 생성자 오버로딩이 아니다
//	public OverLoading(int max,String m) {		//오버로딩이 아님
//	}
	public static void main(String[] args) {
		OverLoading ol1=new OverLoading();
		OverLoading ol2=new OverLoading("그랜져");
		OverLoading ol3=new OverLoading(200);
		//new 연산자로 생성자를 호출할 때 제공되는 매개값의
		//타입과 수에 의해 호출될 생성자가 결정됩니다.
		
	}
}
