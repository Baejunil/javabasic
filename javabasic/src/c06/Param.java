package c06;

public class Param {
	//매개 변수의 개수를 모를 경우
	//메소드의 매개 변수는 개수가 이미 졍해져 있는 것이 일반적이지만,
	//어떤 상황에서는 메소드를 선언할 때 매개 변수의 개수를 알 수 없는
	//경우도 있습니다.
	
	//매개 변수를 배열 타입으로 선언
	void sum1(int[] values) {
		for(int v:values) {
			System.out.println(v);
		}
	}
	
	//매개 변수를 배열 타입으로 선언하면 메소드를 호출하기 전에
	//배열을 생성해야 하는 불편한 점이 있습니다.
	//배열을 생성하지 않고 값의 목록만 넘겨주는 방법도 있습니다.
	//매개변수를  ...를 사용해서 선언하게 되면 메소드 호출 시
	//넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용됩니다.
	
	void sum2(int ...values) {
		for(int v:values) {
			System.out.println(v);
		}
	}
	
	public static void main(String[] args) {
		Param p=new Param();
		int[] values= {1,2,3};
		p.sum1(values);
		p.sum1(new int[]{3,4,5});
		
		//...로 선언된 매개 변수의 값은 다음과 같이 메소드 호출 시
		//쉼표로 나열해주면 됩니다.
		p.sum2(1,2,3);
		p.sum2(1,2,3,4,5);
		
		//...로 선언된 매개 변수는 배열 타입이므로 배열을 직접 매개값으로
		//사용해도 됩니다.
		p.sum2(values);
		p.sum2(new int[]{3,4,5});
	}

}