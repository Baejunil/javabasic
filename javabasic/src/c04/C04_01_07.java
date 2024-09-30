package c04;

//반복문
//반복믄은 어떤 작업(코드)이 반복적으로 실행되도록 할 때 사용된다.
public class C04_01_07 {

	public static void main(String[] args) {
		//for문
		/*
		 * for(초기화식;조건식;증감식){
		 * 	//조건식이 true일 경우
		 * 	실행문;
		 * }
		 */
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//1.for문이 처음 실행될 때 초기화식이 제일 먼저 실행됩니다.
		//2.조건식을 평가해서 true이면 for문 블록 내부의 실행문을 실행하고
		//false이면 for문 블록을 실행하지 않고 종료합니다.
		//3.블록 내부의 실행문들이 모두 실행되면 증감식을 실행하고
		//다시 조건식을 평가합니다.
		//4.조건식의 평가 결과가 true이면 샐행문->증감식->조건식으로 다시 진행하고
		//false이면 for문이 종료됩니다.
		
		//1부터 5까지의 합을 구하시오.
		int sum=0;
		sum=sum+1;
		sum+=2;
		sum+=3;
		sum+=4;
		sum+=5;
		System.out.println("1~5의 합:"+sum);
		
		//1부터 100까지의 합을 구하는  코드를 작성 하시오.
		int result=0;
		for(int i=1;i<=100;i++) {
			result+=i;
		}
		System.out.println("1~100의 합:"+result);
		//for문은 100개의 실행문을 단 3줄로 압축한 것이라고 볼 수 있는데
		//반복문은 한 번 작성된 실행문을 여러 번 반복 실행해주기 때문에
		//코드를 줄여 간결하게 만들어줍니다.
		
		//X 복잡한 증감식은 쓰지 않는다
		for(int i=1;i<=100;i=i+3) {
			result+=i;
		}
		//증감식에 주로 쓰는 연산은 ++,-- 증감연산자를 주로 쓴다
		for(int i=100;i>=1;i--) {
			result+=i;
		}
		
		//1부터 10까지 더하기
		for(int i=0;i<10;i++) {
			//int i=0
			int sum2=0;
			sum2+=i;
		}
//		System.out.println(sum2);
		//변수의 스코프, 하위 블록에서 선언된 변수는
		//상위 블록에서 보이지 않는다
//		System.out.println(i);
		
		//구구단 2단 찍기 - 2*1=2, 2*2=4 1~9->i 2*i
		for(int i=1;i<=9;i++) {
			System.out.println("2*"+i+"="+2*i);
		}
		//구구단 3단 부터 9단까지 찍기를 작성 10:50분전까지
		
		//중첩 for문
		//for문은 또 다른 for문을 내포 할 수 있는데, 이것을 중첩 for문이라고
		//합니다.
		//이 경우 바깥쪽 for문이 한 번 실행할 때마다 중첩된 for문은 지정된
		//횟수 만큼 반복해서 돌다가 다시 바깥쪽 for문으로 돌아 갑니다.
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("i:"+i+","+"j:"+j);
			}
		}
		int n=0;
//		int n=0;
		//구구단 출력하기
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}

}