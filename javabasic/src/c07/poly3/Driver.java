package c07.poly3;
//매개 변수의 다형성
//자동 타입 변환은 필드의 값을 대입할 때에도 발생하지만
//주로 메소드를 호출할 때 많이 발생합니다.
//메소드를 호출할  때에는 매개 변수의 타입과 동일한 매개값을 지정하는 것이 정석이지만
//매개값을 다양화하기 위해 매개 변수에 자식 객체를 지정할 수도 있습니다.
public class Driver {
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
//	public void driveBus(Bus bus) {
//		bus.run();
//	}
	
	public static void main(String[] args) {
		Driver d1=new Driver();
		d1.drive(new Vehicle());
		Vehicle v1=new Vehicle();
		d1.drive(v1);
		
		d1.drive(new Bus());
		//매개 변수의 타입이 클래스일 경우, 해당 클래스의 객체뿐만 아니라
		//자식 객체까지도 매개값으로 사용할 수 있다는 것입니다.
		
		//매개값으로 어떤 자식 객체가 제공되느냐에 따라 메소드의 실행결과는
		//다양핼질 수 있습니다.
		//자식 객체가 부모의 메소드를 재정의했다면 메소드 내부에서 재정의된 메소드를
		//호출함으로써 메소드의 실행결과는 다양해집니다.
	}
}