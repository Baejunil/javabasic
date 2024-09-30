package tast;
import java.util.Scanner;
public class T012 {
	public static void main(String[] args) {
		
		//5번
		char c1= 'a';
		//char c2= c1 + 1;
		//c1+1 결과는 int값이다 
		//char타입으로 강제변화 시킨다
		char c2= (char)(c1+1);
		System.out.println(c2);
		
		//6번
		int x = 5;
		int y = 2;
		int result = x/y; 
		System.out.println(result);
		
		//7번
		int x1 = 5;
		int y2 = 2;
		double result1 =(double)x1/y2; // x1를 double로 변환한다
		System.out.println(result1);
		
		//8번
		double var1 = 3.5;
		double var2 = 2.7;
		int result2=(int)(var1+var2); // 더한후 int로 변환
		System.out.println(result2);
		//9번
		long var11 = 2L;
		float var22 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";

		// var4를 double로 변환
		double d3=Double.parseDouble(var4);
		int result3 = (int)(var11 + var22 + var3 + d3);
		System.out.println(result3);
		
		//10번
		String str1 = 2+ 3+ "";
		String str2 = 2+ ""+ 3;
		String str3 = ""+ 2+ 3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//11번
		byte byteValue = Byte.parseByte("10"); //byte로 변환
		int intValue = Integer.parseInt("1000");//int로 변환
		float floatValue = Float.parseFloat("20.5");//float로 변환
		double doubleValue = Double.parseDouble("3.14159");//double로 변환
		System.out.println(byteValue);
		System.out.println(intValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
		//확인문제 1
		String name="김자바";
		int age =25;
		String tell="010", tell2="123",tell3="4567";
		
		System.out.println("이름:"+ name);
		System.out.print("나이:"+ age);
		System.out.println();
		System.out.printf("전화: %s-%s-%s", tell ,tell2 , tell3);
		//확인문제 2
		Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수: ");
        String strNum1 = scanner.nextLine(); // 첫번째 수 입력받기

        System.out.print("두번째 수: ");
        String strNum2 = scanner.nextLine(); // 두번째 수 입력받기

        // 문자열을 정수로 변환
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        // 덧셈 계산
        
        int result5 = num1 + num2;
        System.out.println("덧셈 결과: " + result5);

		// 확인문제3 
        // 이름 입력
        System.out.print("이름: ");
        String name2 = scanner.nextLine();
        
        // 주민번호 앞 6자리 입력
        System.out.print("주민번호 앞 6자리: ");
        String idNumber = scanner.nextLine();
        
        // 전화번호 입력
        System.out.print("전화번호: ");
        String phoneNumber = scanner.nextLine();
        
        // 결과 출력
        System.out.printf("이름: %s\n", name2);
        System.out.printf("주민번호 앞 6자리: %s\n", idNumber);
        System.out.printf("전화번호: %s\n", phoneNumber);
        
        scanner.close();
        		    }
		

		
		
		
	
	}

