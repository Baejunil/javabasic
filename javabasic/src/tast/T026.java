package tast;

import java.util.Scanner;
import java.time.LocalDate;
public class T026 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("생년월일을 입력하세요 7번째 짜리 까지만 쓰시오"); //생년월일
        String dobN = scanner.nextLine(); 
        //나이
        int age=scAge(dobN);
        
        System.out.println("결제 방법을 선택 하시오(교통카드/현금)");
        String pay= scanner.nextLine();
        
        printBuspay(age, pay);
        
        scanner.close();
	}
	 // 나이를 계산하는 메소드
	private static int scAge(String dobN) {
        // 생년월일 정보 추출
        int year = Integer.parseInt(dobN.substring(0, 2));
    
        LocalDate today = LocalDate.now();
        // 1900년대 또는 2000년대 구분
        if (today.getYear() >= 2000) {
            year += 2000; // 2000년대
        } else {
            year += 1900; // 1900년대
        }
        
        // 기본 나이 계산
        int age = today.getYear() - year;
        return age; // 계산된 나이 반환
    }
    private static void printBuspay(int age, String pay) {
        int fare; // 버스비를 저장할 변수
        
        // 나이에 따라 버스비 결정
        if (age < 6) {
            fare = 0; // 어린이 (무료)
        } else if (age < 19) {
            fare = 1200; // 청소년
        } else if (age < 65) {
            fare = 1300; // 일반
        } else {
            fare = 600; // 노인
        }

        // 결제 방법에 따라 출력
        if (pay.equals("교통카드")) {
            System.out.println("버스비는 " + (fare-100) + "원입니다. (교통카드로 결제 시 할인적용 )");
        } else {
            System.out.println("버스비는 " + fare + "원입니다. (현금 결제)");
        }
}
    }
