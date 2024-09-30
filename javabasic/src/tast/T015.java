package tast;
import java.util.Scanner;
public class T015 {
	public static void main(String[] args) {
		//1번문제
		//반복문: for,while,do-while
		
		//2번문제
		int sum3 = 0;
		for(int i=1; i<=100; i++) {
		
		if(i%3 == 0) {
		sum3 += i;
		}}
		
		System.out.println(sum3);
		//3문제 
		while (true) {
            // 두 개의 주사위를 던진다 (1부터 6까지의 랜덤 숫자 생성)
            int dice = (int)(Math.random() * 6) + 1;
            int dice1 = (int)(Math.random() * 6) + 1;
            // 결과 출력
            System.out.println("(" + dice + ", " + dice1 + ")");
            // 두 주사위의 합이 5인지 확인
            if (dice + dice1 == 5) {
                break; // 합이 5이면 반복 종료
            }
        }
        System.out.println("합이 5가 되어 반복을 종료합니다.");
		
		//문제 4
		for(int x=1; x<=10; x++) {
		for(int y=1; y<=10; y++) {
		if(x*4 + y*5 == 60) {
		System.out.println("(" + x + "," + y + ")");
		}}}
		
		//문제 5
		for(int i=0; i<4; i++) {
		for(int j=0; j<=i; j++) {
		System.out.print("*");
		}
		System.out.println();
	}
		System.out.println();
		//문제 6
		for(int i=0; i<4; i++) {
		for(int j=i+1; j<4; j++) {
		System.out.print(" ");
	}
		for(int j=0; j<=i; j++) {
		System.out.print("*");
	}
		System.out.println();
	}
		System.out.println();
		//문제 7
		boolean run = true;
		int balance=0;
		Scanner scanner =new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금: 2.출금: 3.잔고: 4.종료");
			System.out.print("선택> ");
            String choice = scanner.nextLine(); // 사용자 입력
		switch (choice) {
        case "1":
            System.out.print("예금할 금액: ");  
            int deposit = Integer.parseInt(scanner.nextLine());
            balance += deposit; // 잔고에 추가
            break;
        case "2":
            System.out.print("출금할 금액: ");
            int withdraw = Integer.parseInt(scanner.nextLine());
            if (withdraw <= balance) {
                balance -= withdraw; // 잔고에서 차감
            } else {
                System.out.println("잔고가 부족합니다.");
            }
            break;
        case "3":
            System.out.println("현재 잔고: " + balance + "원");
            break;
        case "4":
            run = false; // 종료
            break;
        default:
            System.out.println("잘못된 선택입니다.");
            break;
            }
		  	
	}
		scanner.close(); // 스캐너 닫기
        System.out.println("프로그램 종료");
		}
}
