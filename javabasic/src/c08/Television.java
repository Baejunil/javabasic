package c08;

//인터페이스 구현
//객체는 인터페이스에서 정의된 추상 메소드와 
//동일한 메소드 이름, 매개 타입, 리턴 타입을 가진
//실체 메소드를 가지고 있어야합니다.

//구현 클래스
//구현 클래스는 보통의 클래스와 동일한데, 인터페이스 타입으로 사용할 수 있음을
//알려주기 위해 클래스 선언부에 implements 키워드를 추가하고
//인터페이스 이름을 명시해야 합니다.
//그리고 인터페이스에 선언된 추상 메소드의 실체 메소드를 선언해야 합니다.
public class Television implements RemoteControl{
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("현재 TV 볼륨: "+volume);
	}
	
	public static void main(String[] args) {
//		RemoteControl rc=new RemoteControl();
		Television t=new Television();
		t.turnOn();
		t.setVolume(50);
		t.turnOff();
		
		//인터페이스 변수에 구현 객체 대입
		RemoteControl rc=new Television();
	}

}