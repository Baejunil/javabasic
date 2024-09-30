package tast;
import java.util.Scanner;
public class T013 {
	public static void main(String[] args) {
		//1번문제
		byte b =5;
		//b = -b; 여기서 b는 byte임 근데 -b는 intdla 그래서 안된다
		b =(byte) -b;//강제 캐스팅 사용
		int result = 10 / b;
		System.out.println(result);
		//2번문제
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); //결과값은 31이다
		//3번문제
		boolean stop = false; // 초기값 설정
		while (!stop) {
		    // 반복할 코드 작성
		    // 조건에 따라 stop을 true로 설정할수있다
			stop = true;
		}
		//4번문제
		int pencils = 534;
		int students = 30;
		//학생이 1명이 가지는 연필개수
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		//남은 연필 개수
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
		//5번문제
		int var1 = 5;
		int var2 = 2;
		//double var3 = var1 / var2;
		double var3 = (double)var1 / var2; 
		// double강재 캐스팅으로 소수점이 포함이 되게 나눈다
		int var4 =(int)(var3 * var2);
		//2.5*2 가되므로
		System.out.println(var4);
		//5가 나온다
		//6번문제
		int value = 356;
		System.out.println((value / 100) * 100);
		//356/100 이면 나머지를 버리면 3이다 이후 *100을 하면 300이 나온다
		//7번문제
		float var11 =10f;
		float var22 = var11/100;
		//if(var22 == 0.1) f형을 비교하는 0.1은 double형으로 해석 되기때문에
		// 다르게 나오기때문에 f형를 사용한다
		if(var22 == 0.1f)        {
			System.out.println("10%입니다.");
			}else {
			System.out.println("10%가 아닙니다.");	
			}
		//8번문제
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)(lengthTop + lengthBottom) * height) / 2;
		//double 형 변환으로 소수점계산을 노린다
		//그리고 사다리꼴 넓이 게산 (밑변+아랫변)*높이/2이다
		System.out.println(area);
		//9번문제
		Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        double firstNumber = scanner.nextDouble(); // 첫 번째 실수 입력받기
        System.out.print("두 번째 수: ");
        double secondNumber = scanner.nextDouble(); // 두 번째 실수 입력받기
        // 두 번째 수가 0 또는 0.0인지 체크
        if (secondNumber == 0) {
            System.out.println("결과: 무한대");
        } else {
       System.out.printf("결과: ",firstNumber/secondNumber ); // 
        }
        
        // 10번문제
        int var12 = 10; // 반지름
        int var21 = 3;  // 원주율의 정수 부분
        int var31 = 14; // 원주율의 소수 부분
        // 문자열 결합하여 원주율 계산
        String piString = var21 + "." + var31; // "3.14"라는 문자열 생성
        double pi = Double.parseDouble(piString); // 문자열을 double로 변환
        // 원의 넓이 계산
        double area1 = pi * var12 * var12;
        // 결과 출력
        System.out.printf("원의 넓이: %.2f%n", area1);
        //11번문제
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("아이디:");
        String name = scanner1.nextLine();
        
        System.out.println("패스워드:");
        String strPassword = scanner1.nextLine();
        int password = Integer.parseInt(strPassword);
        if(name.equals("java")) {
        	if(password == 12345) {
        		System.out.println("로그인 성공");
        		}else {
        		System.out.println("로그인 실패:패스워드가 틀림");
        		}
        }else {
        	System.out.println("로그인 실패: 아이디 존재하지 않음");
        }
        scanner.close(); // Scanner 객체 닫기
        //12번 문제
      //12번 문제
        int x1 = 10;
        int y1 = 5;
        System.out.println((x1 > 7) && (y1 <= 5)); //(true)
        System.out.println((x1 % 3 == 2) || (y1 % 2 != 1));//false

        //13번 문제
        int value4 = 0;
        value4 = value4 + 10; //value4 += 10;
        value4 = value4 - 10; //value4 -= 10;
        value4 = value4 * 10; //value4 *= 10;
        value4 = value4 / 10; //value4 /= 10;

        //14번 문제
        int score = 85;
        String result1 = (!(score > 90)) ? "가" : "나";
        System.out.println(result1);

	}
}
