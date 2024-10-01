package c06;

public class Calacutor {
	//메소드 작성
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result=(double)x/y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public static void main(String[] args) {
		Calacutor c=new Calacutor();
		c.powerOn();
		System.out.println(c.plus(5, 6));
		System.out.println(c.divide(10, 4));
		c.powerOff();
	}
}