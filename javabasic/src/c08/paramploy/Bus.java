package c08.paramploy;

// 강제 타입 변환
//구현 객체가 인터페이스 타입으로 자동 타입 변환하면,
//인터페이스에 선언된 메소드만 사용 가능하다는 제약 사항이 따릅니다.
//경우에 따라서는 구현 클래스에 선언된 필드와 메소드를 사용해야 할 경우도 발생합니다
//이때 강제 타입 변환을 해서 다시 구현 클래스 타입으로 변환한 다음
//구현 클래스의 필드와 메소드를 사용할 수 있습니다.
public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	public void checkFare() {
		System.out.println();
	}
}