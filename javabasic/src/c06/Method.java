package c06;

//메소드
//메소드는 객체의 동작(기능)에 해당하는 중괄호{}블록을 말합니다.
//메소드를 호출하면 중괄호 블록에 있는 모든 코드들이 일괄적으로 실행됩니다.
public class Method {
	//메소드의 기본 문법
	/*
	 * 리턴타입 메소드이름([매개변수선언,...]){
	 * 	실행할 코드를 작성하는 곳
	 * }
	 */
	int plus(int x,int y) {
		int result=x+y;
		return result;
	}
	//메소드 선언
	//리턴 타입
	//리턴 타입은 리턴값의 타입을 말합니다.
	//리턴값이란 메소드를 실행한 후의 결과값을 말합니다.
	
	//리턴값이 없는 메소드 - 리턴타입 자리에 void 키워드 
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public static void main(String[] args) {
		Method m=new Method();
		System.out.println(m.plus(1, 2));
		//메소드의 호출(method call) 메소드이름([매개변수,...])
		m.powerOn();
		int result=m.plus(3, 4);
		System.out.println(result);
		//리턴 값을 받기 위해 변수는 plus()메소드의 리턴 타입인 int타입으로
		//선언되어야 합니다.
		//다른 타입으로 선언된 변수로 리턴값을 대입 받을 수 없다.
//		short r=m.plus(2, 2); //(X)
		
		//리턴 타입이 있다고 해서 반드시 리턴값을 변수에 저장할 필요는 없습니다.
		//리턴 값이 중요하지 않고, 메소드 실행이 중요할 경우에는
		//변수를 선언하지 않고 메소드를 호출할 수도 있습니다.
		m.plus(5, 5);
	}

}