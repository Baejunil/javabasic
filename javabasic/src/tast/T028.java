package tast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T028 {
    public static void main(String[] args) {
        List<String> wishlist = new ArrayList<>(); // 찜 목록 리스트
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. 찜 추가");
            System.out.println("2. 찜 목록 보기");
            System.out.println("3. 찜 수정");
            System.out.println("4. 찜 삭제");
            System.out.println("5. 종료");
            System.out.print("선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: // 아이템 추가
                    System.out.print("찜 추가 물건: ");
                    String item = scanner.nextLine();
                    wishlist.add(item);
                    System.out.println(item + "이(가) 찜 목록에 추가되었습니다.");
                    break;

                case 2: // 찜 목록 보기
                    System.out.println("찜 목록:");
                    if (wishlist.isEmpty()) {
                        System.out.println("찜 목록이 비어 있습니다.");
                    } else {
                        for (int i = 0; i < wishlist.size(); i++) {
                            System.out.println(i + ": " + wishlist.get(i));
                        }
                    }
                    break;

                case 3: // 아이템 수정
                    System.out.print("수정할 물건: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 제거
                    if (indexToUpdate >= 0 && indexToUpdate < wishlist.size()) {
                        System.out.print("새 물건 이름: ");
                        String updatedItem = scanner.nextLine();
                        wishlist.set(indexToUpdate, updatedItem);
                        System.out.println("찜 목록이 수정되었습니다.");
                    } else {
                        System.out.println("잘못된 선택.");
                    }
                    break;

                case 4: // 아이템 삭제
                    System.out.print("삭제할 물건: ");
                    int indexToDelete = scanner.nextInt();
                    if (indexToDelete >= 0 && indexToDelete < wishlist.size()) {
                        wishlist.remove(indexToDelete);
                        System.out.println("아이템이 삭제되었습니다.");
                    } else {
                        System.out.println("잘못된 선택.");
                    }
                    break;

                case 5: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }
}
