package c04;

public class C04_01_06 {

	public static void main(String[] args) {
		//switch문
		//if문처럼 조건식이 true일 경우에 블록 내부의
		//실행문을 실행하는 것이 아니라,
		//변수가 어떤 값을 갖느냐에 따라 실행문이 선택됩니다.
		/*
		 * switch(변수){
		 * 	case 값1:
		 * 		실행문A
		 * 		break;
		 * 	case 값2:
		 * 		실행문B
		 * 		break;
		 * 	default:
		 * 		실행문C
		 * }
		 */
		//주사위 번호 하나 뽑기
		int num=(int)(Math.random()*6)+1;
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				break;
		}
		//if문은 조건식의 결과가 true, false 두  가지밖에 없기 때문에
		//경우의 수가 많아질수록 else-if를 반본적으로 추가해야 하므로
		//코드가 복잡해집니다
		//switch문은 변수의 값에 따라서 실행문이 결정되기 때문에 코드가 간결하다
		//일반적으로 if문을 많이 쓴다
		
		//switch문은 괄호 안의 변수 값과 동일한 값을 갖는 case로 가서
		//실행문을 실행합니다.
		//만약 괄호 안의 변수 값과 동일한 값을 갖는 case가 없으면 default로
		//가서 실행문을 실행합니다.
		//default는 생략 가능합니다.
		
		int time=10;
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
		//case 끝에 break가 붙어 있는 이유는 다음 case를 실행하지 않고
		//switch문을 빠져 나가기 위해서입니다.
		//break가 없다면 다음 case가 연달아 실행되는데
		//이때는 case 값과는 상관없이 실행됩니다.
		
		char grade='c';
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
		//알파벳 대소문자에 관계없이 동일하게 처리하도록 만든 switch문
		
		//String 타입의 switch문
		String position="과장";
		
		switch(position) {
			case "부장":
				System.out.println("연차 20개");
				break;
			case "과장":
				System.out.println("연차 18개");
				break;
			default:
				System.out.println("연차 15개");
		}
	}

}