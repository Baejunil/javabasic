package c09.deep;

//예외 떠넘기기
//메소드 내부에서 예외가 발생할 수 있는 코드를 작성할 때 try-catch블록으로
//예외를 처리하는 것이 기본이지만, 경우에 따라서는 메소드를 호출한 곳으로 예외를
//떠넘길 수도 있습니다.
//이때 사용하는 키워드가 throws입니다.
//throws 키워드는 메소드 선언부 끝에 작성되어 메소드에서 처리하지 않은 예외를
//호출한 곳으로 떠넘기는 역활을 합니다.
//throws 키워드 뒤에는 떠넘길 예외 클래스를 쉼표로 구분해서 나열해주면 됩니다.
//리턴타입 메소드이름(매개변수,..) throws 예외클래스1, 예외클래스2,...{}
//발생할 수 있는 예외의 종류별로 throws뒤에 나열하는 것이 일반적이지만,
//throws Exception만으로 모든 예외를 간단히 떠넘길 수도 있습니다.
//리턴타입 메소드이름(매개변수,...)throws Exception{}
public class ExceptionThrow {
	
	public void method1() throws ClassNotFoundException{
		Class clazz=Class.forName("java.lang.Throwable2");
	}
	
//	public void method2() throws ClassNotFoundException{
	public void method2(){
		try {
			method1();
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args){
		ExceptionThrow et=new ExceptionThrow();
		et.method2();
		System.out.println("end");
	}
	
	//method1() 메소드는 예외를 떠넘겼고, method2()에서 예외를 처리했습니다.
	//main()메소드에서도 throws키워드를 사용해서 예외를 떠넘길수 있는데,
	//결국 JVM이 최종적으로 예외를 처리 하게 됩니다. JVM은 예외의 내용을 콘솔에
	//출력하고 종료되음로서 예외를 처리합니다.
	//main()메소드에서 throws을 붙이는 것은 좋지 못한 예외 처리 방법입니다.

}