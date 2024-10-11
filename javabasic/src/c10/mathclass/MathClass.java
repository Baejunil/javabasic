package c10.mathclass;

//Math 클래스
//java.lang.Math 클래스는 수학 계산에 사용할 수 있는 메소드를 제공하고 있습니다.
//Math 클래스가 제공하는 메소드는 모두 정적(static)메소드이므로 Math클래스로
//바로 사용가능
public class MathClass {
	public static void main(String[] args) {
		//절대값
		//int abs(int a), double abs(double a)
		int v1=Math.abs(-5);
		double v2=Math.abs(-3.14);
		System.out.println(v1);
		System.out.println(v2);
		
		//올림값
		//double ceil(double a)
		double v3=Math.ceil(5.3);
		double v4=Math.ceil(-5.3);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		
		//버림값
		//double floor(double a)
		double v5=Math.floor(5.3);
		double v6=Math.floor(5.3);
		System.out.println("v5="+v5);
		System.out.println("v6="+v6);
	
		//반올림값
		//long round(double a)
		double value=12.3456;
		double temp1=value+100;
		long temp2=Math.round(temp1);
		double v7=temp2/100.0;
		System.out.println("v16"+v7);
		//roubd()메소드는 항상 소수점 첫째 자리에서 반올림해서 정수값을 리턴하
		//만약 원하는 소수 자릿수에서 반올림을 값을 원한다면 반올림할 자릿수가
		//소수점 첫째 자리가 되도록 10^n을 곱한후,round()메소드의 리턴갑승ㄹ
		//얻습니다 그리고 나서 다시 10^n.0을나눠주ㅡ면됩ㄴ다
		//위에 코드느 소수점 셋째 자릿수에서 반올림하는 코드다
		
		//랜덤한 숫자 뽑기 Math.random()
		//랜덤한 정수를 범위 내에서 뽑기
		//(Math.random()*범위)+시작점
		//주사위 번호ㅃㅂ기
		int num1=(int)(Math.random()*6)+1;
		System.out.println(num1);
		//로또 번호 뽑기
		int num2=(int)(Math.random()*45)+1;
		System.out.println(num2);
	
	}
}
