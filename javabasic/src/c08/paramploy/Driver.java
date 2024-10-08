package c08.paramploy;

//매개 변수의 다형성
public class Driver {
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
	public static void main(String[] args) {
		Driver d=new Driver();
		d.drive(new Bus());
		
		Bus b=new Bus();
		d.drive(b);
		
		d.drive(new Taxi());
		
		Vehicle vehicle=new Bus();
		vehicle.run();
		
		Bus b2=(Bus) vehicle;
		b2.run();
		b2.checkFare();
		
		//instanceof 연산자는 인터페이스 타입에서도 사용할 수 있습니다.
		if(vehicle instanceof Bus) {
			Bus bus=(Bus) vehicle;
		}
		//instanceof 연산자로 확인하고 안전하게 강제 타입 변환할 수 있습니다
	}
}