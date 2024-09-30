package c06;

public class Ride {
	String company="현재 자동차";
	int speed;

	public static void main(String[] args) {
		//필드 사용
		//Ride 클래스의 인스턴스 생성
		Ride ride=new Ride();
		System.out.println(ride.company);
		//초기값이 지정되지 않은 필드는 객체 생성시 
		//자동으로 기본 초기값으로 설정됩니다. 
		System.out.println(ride.speed);
		
		//필드의 데이터를 직접 접근 하는 것은
		//객체 지향 관점에서는 안좋다.
		//필드 데이터의 직접 접근은 겹합도를 올리게 되어
		//유지 보수와 확장성을 떨어 뜨립니다.
		//클래스 간에는 상호 작용을 메세지로만 하고
		//메세지를 전달하는 것이 메소드입니다.
		//=> 클래스간 상호 작용은 메소드로 한다.
		//필드 데이터를 상호 작용하는 메소드를 게더(getter),세더(setter)
		//라고 합니다.
	}

}