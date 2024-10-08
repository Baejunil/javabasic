package c08;

//인터페이스(interface)
//인터페이스는 개발 코드와 객체가 서로 통신하는 접점 역활을 합니다.
//개발 코드를 수정하지 않고 사용하는 객체를 변경할 수 있도록 하기 위해
//인터페이스를 사용합니다.

//인터페이스 선언
//[public] interface 인터페이스 이름{}
//인터페이스 이름은 클래스 이름을 작성하는 방법과 동일
//영어 대소문자를 구분하여, 첫글자를 대문자로 하고 나머지는 소문자로 하는것이
//관례이다
public interface InterfaceDetils {
	//상수
	//타입 상수이름=값;
	//추상 메소드
	//타입 메소드이름(매개변수,...);
	
	//인터페이스는 상수 필드와 추상 메소드만을 구성 멤버로 가집니다.
	//인터페이스는 객체(인스턴스)로 생성할 수 없기 때문에 생성자를 가질 수 없습니다.
	
	//상수 필드 선언
	//인터페이스는 객체 사용 방법을 정의한 것이므로 실행 시 데이터를 저장할 수 있는
	//인스턴스 또는 정적 필드를 선언할 수 없습니다.
	//상수 필드는 선언이 가능합니다.
	//상는 public static final로 선언한다.
	//public static final을 생략하더라도 컴파일 과정에서 자동으로 붙게 됩니다.
	//[public static final] 타입 상수이름=값;
	//상수 이름은 대문자로 작성하되, 서로 다른 단어로 구성되어 있을 경우에는
	//언더바(_)로 연결하는 것이 관례입니다.
	//인터페이스 상수는 반드시 선언과 동시에 초기값을 지정해야 합니다.
	public int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	public static final int MIDDLE_VOLUME=5;
	
	//추상 메소드 선언
	//실행 블록이 필요 없는 추상 메소드로 선언합니다.
	//추상 메소드는 리턴 타입, 메소드 이름, 매개 변수만 기술되고
	//중괄호{}를 붙이지 않는 메소드를 말합니다.
	//리턴 타입 메소드이름(매개 변수,...);
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}