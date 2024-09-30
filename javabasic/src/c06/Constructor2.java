package c06;

public class Constructor2 {
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	/*
	 * 클래스이름(매개변수 선언,...){
	 * //객체의 초기화 코드
	 * }
	 */
	//public Constructor2(String s1,String s2,inti1) {
	public Constructor2(String model,String color,int maxSpeed) {
		//tjis는 자기 자신을 가르킨다
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	public Constructor2() {
		//위 다른 생성자를 했으면 기본 생성자가 사라지므로 다시 만들어줘야함
	}
	public static void main(String[]args) {
		Constructor2 constructor2=new Constructor2();
		//클래스 변수에 직접 접근하는 것은 좋지 않다
		//아직 메소드를 배우지 않아서 직접 접근합니다
		constructor2.model="투싼";
		constructor2.color="검정";
		constructor2.maxSpeed=300;
		System.out.println(constructor2.model);
		Constructor2 constructor21=new Constructor2();
		constructor2.model="그랜져";
		constructor2.color="회색";
		constructor2.maxSpeed=320;
		
		//매개변수가 있는 생성자는 타입과 수를 맞춰야 된다
		Constructor2 constructor22= //public Constructor2(String model,String color,int maxSpeed) 가 이것이 된거임
				new Constructor2("아반떼", "흰색",250);
		Constructor2 constructor23= 
				new Constructor2("아반떼1", "흰색1",251);
		Constructor2 constructor24= 
				new Constructor2("아반떼2", "흰색2",252);
		
	}
}
