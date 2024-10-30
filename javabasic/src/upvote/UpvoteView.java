package upvote;

import java.util.List;
import java.util.Scanner;

// 사용자 인터페이스를 담당하는 뷰 클래스
public class UpvoteView {
    private Scanner scanner; // 사용자 입력을 받기 위한 Scanner 객체

    // 생성자: Scanner 객체 초기화
    public UpvoteView(Scanner scanner) {
        this.scanner = scanner;
    }

    // 메뉴를 보여주고 사용자 선택을 받는 메서드
    public int showMenu() {
        System.out.println(" 애니추천 메뉴:");
        System.out.println("0. 종료");
        System.out.println("1. 추천애니 추가");
        System.out.println("2. 추천애니 목록 보기");
        System.out.println("3. 추천애니 수정");
        System.out.println("4. 추천애니 삭제");
        System.out.print("선택: ");

        // 유효한 숫자가 입력될 때까지 반복
        while (!scanner.hasNextInt()) {
            System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            scanner.next(); // 잘못된 입력 무시
        }
        return scanner.nextInt(); // 사용자 선택 반환
    }

    // 추천 목록을 출력하는 메서드
    public void displayRecommendations(List<UpvoteModelDTO> recommendations) {
        System.out.println("추천 목록:");
        if (recommendations.isEmpty()) {
            System.out.println("추천 항목이 없습니다."); // 추천 항목이 없을 경우 메시지 출력
        } else {
            for (UpvoteModelDTO rec : recommendations) {
                System.out.println(rec); // 추천 항목 출력
            }
        }
    }

    // 사용자로부터 추천 항목의 세부 정보를 입력받는 메서드
    public UpvoteModelDTO getRecommendationDetails() {
        scanner.nextLine(); // 개행 문자 소비
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("장르: ");
        String genre = scanner.nextLine();
        System.out.print("설명: ");
        String description = scanner.nextLine();

        // 입력값 검증
        if (title.isEmpty() || genre.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("모든 필드를 입력해야 합니다."); // 필드가 비어있으면 예외 발생
        }

        return new UpvoteModelDTO(0, title, genre, description); // 새로운 추천 항목 생성
    }

    // 유효한 인덱스를 가져오는 메서드
    public int getValidIndex(String prompt, int size) {
        System.out.print(prompt);
        int index = scanner.nextInt(); // 사용자로부터 인덱스 입력받기
        if (index < 0 || index >= size) {
            System.out.println("잘못된 번호입니다."); // 유효하지 않은 인덱스인 경우 메시지 출력
            return -1;
        }
        return index; // 유효한 인덱스 반환
    }

    // 오류 메시지를 출력하는 메서드
    public void displayErrorMessage(String message) {
        System.out.println("오류: " + message); // 오류 메시지 출력
    }
}
