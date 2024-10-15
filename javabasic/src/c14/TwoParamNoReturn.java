package c14;

public class TwoParamNoReturn {
	public static void main(String[] args) {
		//매개변수가 둘인 람다식
		Calculate c;
		c=(a,b)->System.out.println(a+b);
		c.cal(4, 3);
		c=(a,b)->System.out.println(a-b);
		c.cal(4, 3);
	}

}