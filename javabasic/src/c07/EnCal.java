package c07;

public class EnCal extends Calculator{
	
	//메소드 오버라이딩
	//공학 계산기이기 때문에 좀 더 정밀한 계산을 한다
	public double areaCircle(double r) {
		System.out.println("EnCal 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
	
	public static void main(String[] args) {
		EnCal ec=new EnCal();
		System.out.println(ec.areaCircle(3));
	}

}
