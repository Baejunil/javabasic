package c14;

public class NoParamAndReturn {
	public static void main(String[] args) {
		//매개변수가 없는 람다식
		//()소괄호 생략 불가
		Generator gen=()->(int) ((Math.random()*6)+1);
		System.out.println(gen.rand());
	}

}