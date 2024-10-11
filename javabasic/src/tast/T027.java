package tast;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 주민번호 입력
        System.out.print("생년월일 ");
        String dobN = scanner.nextLine();

        // 성인 확인
        if (!isAdult(dobN)) {
            System.out.println("성인이 아니에요. 성인이 된후 오세요.");
            return; // 프로그램 종료
        }

        // 로또 세트 입력
        int sets = gls(scanner);

        // 로또 번호 생성
        for (int i = 0; i < sets; i++) {
            int[] lnb = gln();
            System.out.print("세트 " + (i + 1) + ": ");
            for (int number : lnb) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static boolean isAdult(String dobN) {
        // 생년월일 정보에서 연도 추출
        int year = Integer.parseInt(dobN.substring(0, 2));
        int currentYear = java.time.LocalDate.now().getYear() % 100; // 2자리 연도
        return (currentYear - year) >= 19; // 성인인지 확인
    }

    private static int gls(Scanner scanner) {
        int sets = 0;
        while (true) {
            System.out.print("몇 세트 사시나요? (1세트당 1000원, 최대 20세트): ");
            try {
                sets = scanner.nextInt();
                if (sets <= 0) {
                    System.out.println("세트수는 1이상이어야 합니다.");
                } else if (sets > 20) {
                    System.out.println("최대 20세트까지 가능합니다.");
                } else {
                    int totalCost = sets * 1000;
                    if (totalCost > 20000) {
                        System.out.println("총 가격이 2만원을 초과합니다 다시 입력하세요");
                    } else {
                        break; 
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해주세요.");
                scanner.next(); 
            }
        }
        return sets;
    }

    private static int[] gln() {
        int[] lnb = new int[6];
        int count = 0;

        while (count < 6) {
            int num = (int)(Math.random() * 45) + 1; 
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (lnb[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                lnb[count] = num;
                count++;
            }
        }

        return lnb; 
    }
}
