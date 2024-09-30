package c04;

public class C04_01_10 {

	public static void main(String[] args) {
		// do-while문
		//블록 내부의 실행문을 우선 실행하고 실행 결과에 따라서
		//반복 실행을 계속할지 결정합니다
		/*
		 * do{
		 * 실행문;
		 * }while(조건식)
		 * 1. do-while문이 처음 실행될 때 실행문을 우선 실행합니다
		 * 2. 실행문이 모두 실행되면 조건식을 평가합니다.
		 * 3. 조건식의 결과가 true이면 실행문 ->조건문과 같이 반복실행을 합니다
		 * 4. 조건식의 결과 false이면 do-while문을 종료합니다
		 *
		 * 		 */
		int i=3;
		do {
			System.out.println("HELLO,Java");
			i++;
		}while(i<3);
		//break문
		//break문은 반복문의 실행을 중지 할 때 사용됩니다.
		//break문은 대개 if문과 같이 사용되어 if문의 조건식에 따라
		//반복문을 종료할 때 상용합니다.
		
		//주사위 번호 중 하나를 반복적으로 무작위로 뽑되.
		//6이 나오면 while문을 종료합니다.
		int count =0;
		while(true) {
			int num=(int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num==6) {
			break;
			}
			System.out.println((count++)+"반복");
		}
		//continue문
		//continue문이 실행되면 반복문의 조건식으로 실행합니다
		
		//1에서 10사이의 수 중에서 짝수만 출력하는 코드를 작성하세요
		for(int j=1;j<=10;j++) {
			if(j%2==1) {
				continue;
			}
			System.out.println(j);
		}
	}

}
