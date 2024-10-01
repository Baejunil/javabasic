package tast;

import java.util.Scanner;

public class T018_ {

    // 더하기
    int plus(int a, int b) {
        return a + b;
    }

    // 빼기
    int minus(int a, int b) {
        return a - b;
    }

    // 곱하기
    int times(int a, int b) {
        return a * b;
    }

    // 나누기
    double divided(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
    }

    // 나머지
    int remainder(int a, int b) {
        return a % b;
    }

    // 직사각형 둘레
    int rectangle1(int length, int width) {
        return 2 * (length + width);
    }

    // 직사각형 넓이
    int rectangle2(int length, int width) {
        return length * width;
    }

    // 삼각형 넓이
    double triangle(double base, double height) {
        return 0.5 * base * height;
    }

    // 원의 넓이
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 정사각형 넓이
    int squareArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        T018 math = new T018();
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 연산을 선택하세요:");
        System.out.println("1: 덧셈");
        System.out.println("2: 뺄셈");
        System.out.println("3: 곱셈");
        System.out.println("4: 나눗셈");
        System.out.println("5: 나머지");
        System.out.println("6: 직사각형 둘레");
        System.out.println("7: 직사각형 넓이");
        System.out.println("8: 삼각형 넓이");
        System.out.println("9: 원의 넓이");
        System.out.println("10: 정사각형 넓이");
        System.out.print("11:종료 ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // 덧셈
                System.out.print("첫 번째 수: ");
                int num1 = scanner.nextInt();
                System.out.print("두 번째 수: ");
                int num2 = scanner.nextInt();
                System.out.println("더하기: " + math.plus(num1, num2));
                break;

            case 2: // 빼기
                System.out.print("첫 번째 수: ");
                num1 = scanner.nextInt();
                System.out.print("두 번째 수: ");
                num2 = scanner.nextInt();
                System.out.println("빼기: " + math.minus(num1, num2));
                break;

            case 3: // 곱하기
                System.out.print("첫 번째 수: ");
                num1 = scanner.nextInt();
                System.out.print("두 번째 수: ");
                num2 = scanner.nextInt();
                System.out.println("곱하기: " + math.times(num1, num2));
                break;

            case 4: // 나누기
                System.out.print("첫 번째 수: ");
                num1 = scanner.nextInt();
                System.out.print("두 번째 수: ");
                num2 = scanner.nextInt();
                System.out.println("나누기: " + math.divided(num1, num2));
                break;

            case 5: // 나머지
                System.out.print("첫 번째 수: ");
                num1 = scanner.nextInt();
                System.out.print("두 번째 수: ");
                num2 = scanner.nextInt();
                System.out.println("나머지: " + math.remainder(num1, num2));
                break;

            case 6: // 직사각형 둘레
                System.out.print("길이: ");
                int length = scanner.nextInt();
                System.out.print("너비: ");
                int width = scanner.nextInt();
                System.out.println("둘레: " + math.rectangle1(length, width));
                break;

            case 7: // 직사각형 넓이
                System.out.print("길이: ");
                length = scanner.nextInt();
                System.out.print("너비: ");
                width = scanner.nextInt();
                System.out.println("넓이: " + math.rectangle2(length, width));
                break;

            case 8: // 삼각형 넓이
                System.out.print("밑변: ");
                double base = scanner.nextDouble();
                System.out.print("높이: ");
                double height = scanner.nextDouble();
                System.out.println("넓이: " + math.triangle(base, height));
                break;

            case 9: // 원의 넓이
                System.out.print("반지름: ");
                double radius = scanner.nextDouble();
                System.out.println("넓이: " + math.circleArea(radius));
                break;

            case 10: // 정사각형 넓이
                System.out.print("한 변의 길이: ");
                int side = scanner.nextInt();
                System.out.println("넓이: " + math.squareArea(side));
                break;

            case 11:
                System.out.println("종료합니다.");
                scanner.close(); // Scanner 닫기
                return; // 프로그램 종료
        }

        scanner.close(); // Scanner 닫기
    }
}
