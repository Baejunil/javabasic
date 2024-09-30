package c03;

//연산자와 연산식
//연산에 사용되는 표시나 기호를 연산자라고 합니다
//연산자와 함께 연산되는 데이터를 피연산자라고 합니다.
//연산자와 피연산자를 이용하여 연산의 과정을 기술한 것을 연산식이라고 부릅니다
public class C03_01_01 {

	public static void main(String[] args) {
		int i=1*2+3;
		//연산자의 종류
		//연산자는 필요로 하는 피연산자의 수에 따라 단항, 이항, 삼항
		//연산자로 구분됩니다.
		
		//단항 연산자
		//부호 연산자(+,-)
		int i1=+100;
		int i2=-100;
		double d1=+3.14;
		double d2=-10.5;
		
		//+연산자는 변수값의 부호를 유지하고
		//-연산자는 변수값의 부호를 양수는 음수로, 음수는 양수로 바꿉니다.
		//부호 연산자는 정수 및 실수 타입 변수 앞에도 분일 수 있습니다.
		//값의 부호를 유지하거나 바꾸기 위해 사용됩니다.
		int x=-100;
		int r1=+x;
		int r2=-x;
		System.out.println(r1);
		System.out.println(r2);
		
		//부호 연산자의 결과가 int 타입입니다.
		byte b=100;
		byte b1=(byte)-b;
		int r3=-b;
		byte b2=(byte)r3;
		
		//이모티콘(win+.)
		//증감 연산자(++,--)⭐☆
		//증감 연산자는 변수의 값을 1증가(++)시키거나 1감소(--)시키는
		//연산자를 말합니다.
		//boolean 타입을 제외한 모든 기본 타입의 피연산자에 사용할 수 있습니다.
		//연산식|설명
		//++피연산자|다른 연산을 수행하기 전에 피연산자의 값을 1 증가 시킴
		//--피연산자|다른 연산을 수행하기 전에 피연산자의 값을 1 감소 시킴
		//피연산자++|다른 연산을 수행한 후에 피연산자의 값을 1 증가 시킴
		//피연산자--|다른 연산을 수행한 후에 피연산자의 값을 1 감소 시킴
		int num=5;
		++num;
		System.out.println(num);
		//++연산자는 피연산자의 값을 1을 더해서 그 결과를
		//다시 피연산자에 저장합니다.
		//++연산자를 증가 연산자라고 부릅니다.
		int num1=5;
		num1=num1+1;//++num1;
		System.out.println(num1);
		
		int num2=5;
		--num2;
		System.out.println(num2);
		//--연산자는 피연산자의 값에서 1을 뺀 후 그 결과를 다시 피연산자에
		//저장합니다.
		//--연산자를 감소 연산자라고 부릅니다.
		int num3=5;
		++num3;
		++num3;
		--num3;
		System.out.println(num3);
		
		int num4=5;
		System.out.println(++num4);//6
		System.out.println(num4++);//6
		System.out.println(num4);//7
		
		//논리 부정 연산자(!) not
		//true를 false로, false를 true로 변경하기 때문에
		//boolean 타입에만 사용할 수 있습니다.
		boolean bl1=true;
		boolean bl2=false;
		System.out.println(bl1);
		System.out.println(bl2);
		System.out.println(!bl1);
		System.out.println(!bl2);
		
		//논리 부정 연산자는 조건문과 제어문에서 조건식의 값을
		//부정하도록 해서 실행 흐름을 제어할 때 주로 사용합니다.
		if(true) {
			//()안이 true이면 실행되는 블록
		}else {
			//()안이 false이면 실행되는 블록
		}
		int num5=5;
		//num5가 4보다 작은 경우에만 조건적으로 실행
		boolean bl3=num5>4;
		if(!bl3) {
			System.out.println("bl3은 4보다 작습니다.");
		}
		
		System.out.println(bl3);
		
		//두 가지 상태(true/false)를 번갈아가며 변경하는 토글(toggle)
		//기능을 구현할 때도 사용합니다.
		boolean play=true;
		System.out.println(play);
		play=!play;
		System.out.println(play);
		play=!play;
		System.out.println(play);
	}

}