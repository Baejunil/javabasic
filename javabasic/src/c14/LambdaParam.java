package c14;

public class LambdaParam {
	
	public void getPrintable(Printable p) {
		System.out.println("getPrintable 호출됨");
	}
	
	public static void main(String[] args) {
		LambdaParam lp=new LambdaParam();
		lp.getPrintable(new Printable() {
			@Override
			public void print(String s) {
				
			}
		});
		//람다식의 인자 전달도 가능하다
		lp.getPrintable((s)->{});
	}
}