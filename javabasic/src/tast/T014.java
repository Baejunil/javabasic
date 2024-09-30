package tast;

import java.util.Scanner;

public class T014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2번 문제
        System.out.println("간단한 심리 테스트 2번입니다");
        System.out.println("문제에 대한 답을 선택하세요");
        System.out.println("가을을 맞이하여 책장 정리를 했는데 책상 위에 필름이 하나 있습니다.");
        System.out.println("그래서 필름을 인화해봤는데 사진에는 어떤게 찍혀있을까요?");
        System.out.println("1) 어린이 사진");
        System.out.println("2) 도시의 야경");
        System.out.println("3) 산의 풍경");
        System.out.println("4) 동물");
        System.out.print("선택: ");
        int choice2 = scanner.nextInt();
        scanner.nextLine(); // 버퍼 제거

        if (choice2 == 1) {
            System.out.println("1) 어린이 사진");
            System.out.println("눈물과 인정에 약한 스타일");
        } else if (choice2 == 2) {
            System.out.println("2) 도시의 야경");
            System.out.println("인간 관계가 중요하다고 생각하며 술에 의존하는 스타일");
        } else if (choice2 == 3) {
            System.out.println("3) 산의 풍경");
            System.out.println("약간의 스트레스만 있어도 많이 불안해하는 스타일");
        } else if (choice2 == 4) {
            System.out.println("4) 동물");
            System.out.println("이성으로부터 많은 호감을 얻는 스타일");
        }

        // 3번 문제
        System.out.println("간단한 심리 테스트 3번입니다.");
        System.out.println("문제에 대한 답을 선택하세요.");
        System.out.println("당신은 지금 사막을 걷고 있습니다.");
        System.out.println("<호랑이, 원숭이, 양, 소, 말>과 함께 동행 중인데요.");
        System.out.println("사막을 걷다가 하나의 동물을 버려두고 가야만 한다면");
        System.out.println("어떤 동물부터 첫 번째로 버리시겠습니까?");
        System.out.println("1) 호랑이");
        System.out.println("2) 원숭이");
        System.out.println("3) 양");
        System.out.println("4) 소");
        System.out.println("5) 말");
        System.out.print("선택: ");
        int choice3 = scanner.nextInt();
        scanner.nextLine(); // 버퍼 제거

        if (choice3 == 1) {
            System.out.println("1) 호랑이 자존심");
            System.out.println("원숭이: 자식 / 양 : 사랑 / 소 : 재산 / 말 : 지식");
        } else if (choice3 == 2) {
            System.out.println("2) 원숭이 자식");
            System.out.println("호랑이 : 자존심 / 양 : 사랑 / 소 : 재산 / 말 : 지식");
        } else if (choice3 == 3) {
            System.out.println("3) 양 사랑");
            System.out.println("호랑이 : 자존심 / 원숭이: 자식 / 소 : 재산 / 말 : 지식 ");
        } else if (choice3 == 4) {
            System.out.println("4) 소 재산");
            System.out.println("호랑이 : 자존심 / 원숭이: 자식 / 양 : 사랑 / 말 : 지식");
        } else if (choice3 == 5) {
            System.out.println("5) 말 지식");
            System.out.println("호랑이 : 자존심 / 원숭이: 자식 / 양 : 사랑 / 소 : 재산 ");
        }

        // 4번 문제
        System.out.println("간단한 심리 테스트 4번입니다.");
        System.out.println("다음 중 좋아하는 빵을 골라보세요");
        System.out.println("1) 바게트빵, 식빵");
        System.out.println("2) 생크림 케이크");
        System.out.println("3) 카스테라");
        System.out.println("4) 파이, 페이스트리");
        System.out.print("선택: ");
        int choice4 = scanner.nextInt();
        scanner.nextLine(); // 버퍼 제거

        if (choice4 == 1) {
            System.out.println("1) 바게트빵, 식빵");
            System.out.println("단 것을 싫어하는 당신은 서구적인 스타일.");
            System.out.println("지루한 것을 싫어하기 때문에 무언가 다른 것을 찾기 위해 항상 뛰어다님.");
        } else if (choice4 == 2) {
            System.out.println("2) 생크림 케이크");
            System.out.println("분위기에 압도되는 로맨티스트 스타일");
            System.out.println("영화 감상 등을 취미로 하는 당신은 낭만이라는 걸 아는 스타일");
        } else if (choice4 == 3) {
            System.out.println("3) 카스테라");
            System.out.println("항상 많은 사람들과 잘 어울리는 당신은 원만한 성격을 소유한 스타일");
            System.out.println("자기 관리를 잘해서 언제나 모범이 될 가능성이 큼");
        } else if (choice4 == 4) {
            System.out.println("4) 파이, 페이스트리");
            System.out.println("무궁무진한 호기심으로 도전하는 스타일");
            System.out.println("자신의 일에도 열정이 많은 사람");
        }

        // 5번 문제
        System.out.println("간단한 심리 테스트 5번입니다.");
        System.out.println("정원에 나무를 심는다면 어떤 나무를 심으시겠어요?");
        System.out.println("1) 예쁜 꽃이 피는 나무");
        System.out.println("2) 먹을 수 있는 열매가 열리는 나무");
        System.out.println("3) 상록수");
        System.out.println("4) 낙엽수");
        System.out.print("선택: ");
        int choice5 = scanner.nextInt();
        scanner.nextLine(); // 버퍼 제거

        if (choice5 == 1) {
            System.out.println("1) 예쁜 꽃이 피는 나무");
            System.out.println("다른 사람에게 비춰지는 자신의 모습을 중시함.");
        } else if (choice5 == 2) {
            System.out.println("2) 먹을 수 있는 열매가 열리는 나무");
            System.out.println("실제의 자신과 내면을 중시함");
        } else if (choice5 == 3) {
            System.out.println("3) 상록수");
            System.out.println("독립적이고 독보적인 자기 마음대로 하는 걸 중시함");
        } else if (choice5 == 4) {
            System.out.println("4) 낙엽수");
            System.out.println("협조적이고 유연성을 중시함");
        }

        scanner.close(); // 스캐너 닫기
    }
}
