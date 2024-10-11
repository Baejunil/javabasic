package c10.wrap;

//Wrapper(포장) 클래스
//자바 기본 타입(byte, char, short, int, long, floast, double, boolean
//의 값을 갖는 객체를 생성할 수 있습니다.
//이런 객체를 포장(wrapper)객체라고 하는데, 그 이유는 기본 타입의 값을 내부에
//두고 포장하기 때문입니다.
//컬렉션 프레임워크에서 기본 타입 값을 객체로 생성해서 관리할 때 주로 사용됩니다.
//포장 클래스
//Byte, Character, Short, Integer, Long, Float, Double, Boolean
public class WrapperClass {
	public static void main(String[] args) {
		//박싱(Boxing)과 언박싱(Unboxing)
		//기본 타입의 값을 포장 객체로 만드는 과정을 박싱이라고 하고,
		//반대로 포장 객체에서 기본 타입의 값을 얻어내는 과정을 언박싱이라고 합니다.
		//박싱하는 방법
		Integer i=new Integer(100);
		Integer in=new Integer("100");
		Double d=new Double(10.5);
		Boolean b=new Boolean(false);
		
		//각 포장 클래스마다 가지고 있는 정적 valueOf()메소드를 사용할 수도
		//있습니다.
		Integer i1=Integer.valueOf(1000);
		Integer i2=Integer.valueOf("1000");
		//다시 기본 타입의 값을 얻어내기 위해서는(언박싱하기 위해서는)
		//각 포장 클래스마다 가지고 있는 '기본타입이름+Value()'메소드를
		//사용하면 됩니다.
		int int1=i1.intValue();
		double dou1=d.doubleValue();
		boolean b1=b.booleanValue();
		
		//자동 박싱과 언박싱
		//기본 타입 값을 직접 박싱, 언박싱하지 않아도 자동적으로 박싱과 언박싱이
		//일어나는 경우가 있습니다.
		//자동 박싱은 포장 클래스 타입에 기본값이 대입될 경우에 발생합니다.
		
		//자동박싱
		Integer i3=100;
		
		//자동 언박싱은 기본 타입에 포장 객체가 대입되는 경우와 연산에서 발생합니다.
		
		//자동 언박싱
		int int3=i3;
		int int4=i3+100;
		
		//문자열을 기본 타입 값으로 변환
		//대부분의 포장 클래스에는 'parse+기본타입이름'으로 되어 있는 정적(static)
		//메소드가 있습니다.
		//이 정적 메소드는 문자열을 매개값으로 받아 기본 타입 값으로 변환합니다.
		int value1=Integer.parseInt("10");
		double value2=Double.parseDouble("3.14");
		boolean value3=Boolean.parseBoolean("true");
		
		//포장 값 비교
		//포장 객체는 내부의 값을 비교하기 위해 ==와 !=연산자를 사용하지 않는 것이
		//좋습니다.
		//이 연산자는 내부의 값을 비교하는 것이 아니라 포장 객체의 참조를 비교하기
		//때문입니다.
		Integer obj1=300;
		Integer obj2=300;
		System.out.println(obj1==obj2);
		//언박싱한 값을 얻어 비교를 해야 합니다.
		//직접 내부 값을 언박싱해서 비교하거나, equals()메소드 내부 값을
		//비교하는 것이 좋습니다.
		System.out.println("equals() 결과: "+obj1.equals(obj2));
	}

}