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
	}
}