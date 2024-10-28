package upvote;

import java.util.List;
import java.util.Scanner;

public class UpvoteView {
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
    public void getRecommendationDetails() {
        System.out.print("제목: ");
        String title = new Scanner(System.in).nextLine();
        System.out.print("장르: ");
        String genre = new Scanner(System.in).nextLine();
        System.out.print("설명: ");
        String description = new Scanner(System.in).nextLine();

        // 필요에 따라 반환값 설정 가능
        // 예: return new UpvoteModelDTO(title, genre, description);
    }
}
