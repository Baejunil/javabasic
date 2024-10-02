package c06.access;

//필드 접근 제한
public class FieldAccess {
//	String name;
	//접근 제한자 없는 경우는 default 접근 제한입니다.
	private String name;
	//클래스 변수를 선언할 때는 접근 제한자는 private을 붙인다
	
	//클래스, 생성자, 메소드는 public
	//클래스 변수는 private
	
	//Getter와 Setter메소드
	//일반적으로 객체 지향 프로그래밍에서는 객체의 필드를 객체 외부에서
	//직접적으로 접근하는 것을 막습니다.
	//외부에서 객체의 데이터를 읽을 때나 값을 할당할 때 
	//메소드를 사용하는 것이 좋습니다.
	//클래스를 선언할 때 필드를 private로 선언해서 외부로부터 보호하고,
	//필드에 대한 Setter와 Getter메소드를 작성해서 필드값을
	//안전하게 변경/사용하는 것이 좋습니다.
	
	private int number;
	
	//Setter
	public void setNumber(int number) {
		this.number=number;
	}
	
	//Getter
	public int getNumber() {
		return number;
	}
	
}