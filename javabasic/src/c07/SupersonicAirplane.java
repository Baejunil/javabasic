package c07;

public class SupersonicAirplane extends Airplane{
	private String flyMode="NORMAL";
	
	@Override
	public void fly() {
		//부모 메소드 호출 -super.fly();
		if(flyMode=="SUPERSONIC") {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
		//자식 클래스에서 부모클래스의 메소드를 재정의하게 되면,
		//부모 클래스의 메소드는 숨겨지고 재정의된 자식 메소드만 사용됩니다.
		//그러나 자식 클래스 내부에서 재정의된 부모 클래스의 메소드를
		//호출해야 하는 상황이 발생한다면 명시적으로 super키워드를 붙여서
		//부모 메소드를 호출할 수 있습니다.
	}
	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.fly();
	}
	
	//final 클래스와 final 메소드
	//final 키워드는 클래스, 필드, 메소드를 선언할 때 사용할 수 있는데
	//어디에 쓰이냐에 따라 해석이 조금씩 달라집니다.
	//필드를 선언할 때 final이 지정되면 초기값 설정 후 더 이상 값을
	//변경할 수 없습니다.
	//클래스를 선언할 때 final키워드를 class 앞에 붙이면
	//이 클래스는 최종적인 클래스이므로 상속할 수 없는 클래스가 됩니다.
	//즉, final클래스는 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없다
	//메소드를 선언할 때 final 키워드를 붙이면 이 메소드는 최종적인 메소드이므로
	//재정의할 수 없는 메소드가 됩니다.
	//즉, 부모 클래스를 상속해서 자식 클래스를 선언할 때 부모 클래스에 선언된
	//final메소드는 자식 클래스에서 재정의할 수 없다는 것입니다.
	
	//protected 접근 제한자
	//다른 패키지에서는 자식 클래스만 접근을 허용하는 접근 제한자입니다.
	//다른 클래스의 클래스 변수는 게더 세더를 이용하므로
	//상속 클래스에서 직접 변수를 접근할 일이 없으므로 일반적으로는
	//많이 쓰이지 않습니다.

}
