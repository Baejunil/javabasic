package c06.access;

//무결성
//데이터에는 제약사항이 존재합니다
//제약사항에 맞게 결점이 없는 상태를 데이터 무결성이라고 합니다.
public class Perason {
	private String name;
	private int age;
	
	public void setAge(int age) {
		//메소드를 통해서 필드를 변경하는 방법으로
		//매개값을 검증해서 유효한 값만 객체의 필드로 저장할 수 있다.
		//setter메소드의 또 다른 역활이다.
		if(age<0) {
			System.out.println("나이는 음수일 수 없습니다.");
			return;
		}
		this.age=age;
	}
	
	public static void main(String[] args) {
		Perason p1=new Perason();
		//외부에서 음수로 변경하면 클래스 변수의 무결성이 깨집니다.
//		p1.age=-10;
	}

}