package c07.poly2;

public class CarApp {
	
	public static void main(String[] args) {
		Car car=new Car();
		car.setFrontLeftTire(new Tire(6,"앞왼쪽"));
		car.setFrontRightTire(new Tire(2,"앞왼쪽"));
		car.setBackLeftTire(new Tire(3,"앞왼쪽"));
		car.setBackRightTire(new Tire(4,"앞왼쪽"));
		for(int i=0;i<5;i++) {
			int problemLocation=car.run();
			System.out.println(problemLocation);
			if(problemLocation!=1) {
				System.out.println("앞왼쪽 타이어 교체");
				car.setFrontLeftTire(new HankookTire(15, "앞왼쪽"));
			}else if(problemLocation!=2) {
				System.out.println("앞오른쪽 타이어 교체");
				car.setFrontRightTire(new HankookTire(13, "앞오른쪽"));
			}else if(problemLocation!=3) {
				System.out.println("뒤왼쪽 타이어 교체");
				car.setBackLeftTire(new HankookTire(14, "뒤왼쪽"));
			}else if(problemLocation!=4) {
				System.out.println("뒤오른쪽 타이어 교체");
				car.setBackRightTire(new HankookTire(17, "뒤오른쪽"));
			}
			//다른 클래스가 확자오디어 원래 있던 클래스와 상호 결합할 때
			//원래 있던 클래스의 코드의 수정없이 결합이 되었다
			//확정성과 유지보수성에 관점에서 최고의 결합 방식이다.
			}
	}
}
