package c09;

//예외 클래스
//예외(exception)란 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해
//발생하는 프로그램 오류를 말합니다.
//예외가 발생되면 프로그램은 곧바로 종료된다는 점에서는 에러와 비슷합니다.
//예외는 예외 처리를 통해 프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 할 수
//있습니다.
//자바 예외가 발생할 가능성이 높은 코드를 컴파일할 때 예외 처리 유무를 확인합니다.
//만약 예외 처리 코드가 없다면 컴파일이 되지 않습니다.

//예외와 예외 클래스
//예외는 두 가지 종류가 있습니다. 하나는 일반 예외이고, 다른 하나는 실행 예외입니다.
//일반 예외는 컴파일러 체크 예외라고도 하는데, 프로그램 실행 시 예외가 발생할 가능성이
//높기 때문에 자바 소스를 컴파일하는 과정에서 해당 예외 처리 코드가 있는지 검사합니다.
//만약 예외 처리 코드가 없다면 컴파일 오류가 발생합니다.
//실행 예외는 컴파일러 넌 체크 예외라고도 하는데, 실행 시 예측할 수 없이 갑자기
//발생하기 때문에 컴파일하는 과정에서 예외 처리 코드가 있는지 검사하지 않습니다.
//자바에서는 예외를 클래스로 관리합니다.JVM은 프로그램을 실행하는 도중에 예외가
//발생하면 해당 예외 클래스로 객체를 생성합니다
public class ExceptionDetails {
	//실행 예외
	//NullpointerException
	//자바 프로그램에서 가장 비번하게 발생하는 실행 예외입니다.
	//이것은 객체 참조가 없는 상태, 즉null값을 갖는 참조 변수로 객체 접근 연산자인
	//닷(.)을 사용했을 때 발생합니다.
	//객체가 없는 상태에서 객체를 사용하려 했으니 예외가 발생하는 것입니다.
	
	public void printHello() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		ExceptionDetails ed=null;
		ed.printHello();
		System.out.println("프로그램 끝");
		//프로그램에서 예외가 발생하면 예외 메시지가 Console뷰에 출력되면서
		//프로그램이 종료됩니다.
		
		//ArrayIndexOutOfboundException
		//배열에서 인텍스 범위를 초과할 경우 예외가 발생합니다.
		int[] arr= {1,2,3};
		System.out.println(arr[0]);
		//System.out.println(arr[3]);
		
		//NumberFormatException
		//프로그램을 개발하다 보면 문자열로 되어 있는 데이터를
		//숫자로 변경하는 경우가 자주 발생합니다.
		//문자열을 숫자로 변환하는 방법은 여러 가지가 있지만
		//주로 다음코드를 가장 많이 사용합니다

		String data0=new String("300");
		String data1="100";
		String data2="100a";
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2);
		
		//ClassCastException
		//타입 변환은 상위 클래스와 하위 클래스 간에 발생하고
		//구현 클래스와 인터페이스 간에도 발생합니다.
		//이러한 관계가 아닌데 타입 변환 할려고 하면 예외가 발생됩니다.
		Object obj=new ExceptionDetails();
		ExceptionDetails ed1=(ExceptionDetails)obj;
		String str=(String)obj;
		
		System.out.println("프로그램 끝");
	
	
	}
}
