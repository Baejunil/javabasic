package c10.wrap;

//wrapper(포장) 클래스
//자바 기본 타입(byte, chat,short,int,long,floast,double,boolean)
//의 값을 갖는 객체를 생성할구 있습니다
//이런 객체를 포자(wrapper)객체라고 하는데, 그이유는 기본타임의 값을 내부애
//두고 포장하기 때문에
//컬렉션 프레임워크에서 기본 타입 값을 객체로 생성해서 관리할 때 주로사용됩니다
//프장클래스
//Byte Chatacter,Short,Int,Iong,Floast,Fouble,Boolean)
public class WrapperClass {
	public static void main(String[] atgs) {
		//박싱(Boxing)과 언박싱(Unboxing)
		//기본 타입의 값을 포장 객체로 만든는 광정을 박싱이라고 하ㅗㄱ,
		//반대로 포장객체에서 기본 타입의 값을 얻어내는 과정을 언박싱으라고 하빈다
		//박싱하는 방법
		Integer i-new Integer(100);
		Double d=new Double(10.5);
		Boolean b=new Boolean(false);
		
		//각 포장 클래스마다 가지고 있는정적 valueOf(0)메소드를 사용할수도 
		//할수있븐디ㅏ
		Integer i1-new Integer.valueOf(100);
		Integer i2-new Integer.valueOf("1000");
		
	}
}
