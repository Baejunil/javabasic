package upvote;

import java.util.List;
import java.util.Scanner;

public class UpvoteView {
    private Scanner scanner; // Scanner를 클래스 속성으로 정의

    // 생성자
    public UpvoteView(Scanner scanner) {
        this.scanner = scanner;
    }

    // 추천 목록 출력
    public void displayRecommendations(List<UpvoteModelDTO> recommendations) {
        System.out.println("추천 목록:");
        if (recommendations.isEmpty()) {
            System.out.println("추천 항목이 없습니다.");
        } else {
            for (UpvoteModelDTO rec : recommendations) {
                System.out.println(rec);
            }
        }
    }

 // 사용자로부터 제목, 장르, 설명 입력 받기
    public UpvoteModelDTO getRecommendationDetails() {
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("장르: ");
        String genre = scanner.nextLine();
        System.out.print("설명: ");
        String description = scanner.nextLine();

        // 입력 검증
        if (title.isEmpty() || genre.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("모든 필드를 입력해야 합니다."); // 예외 발생
        }

        // 기본 번호 0을 사용하여 UpvoteModelDTO 객체 생성
        return new UpvoteModelDTO(0, title, genre, description);
    }

}
