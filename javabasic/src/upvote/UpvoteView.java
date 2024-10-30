package upvote;

import java.util.List;
import java.util.Scanner;

public class UpvoteView {
    private Scanner scanner;

    public UpvoteView(Scanner scanner) {
        this.scanner = scanner;
    }

    public int showMenu() {
        System.out.println(" 애니추천 메뉴:");
        System.out.println("0. 종료");
        System.out.println("1. 추천애니 추가");
        System.out.println("2. 추천애니 목록 보기");
        System.out.println("3. 추천애니 수정");
        System.out.println("4. 추천애니 삭제");
        System.out.print("선택: ");

        while (!scanner.hasNextInt()) {
            System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            scanner.next(); // 잘못된 입력 무시
        }
        return scanner.nextInt();
    }

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

    public UpvoteModelDTO getRecommendationDetails() {
        scanner.nextLine(); // 개행 문자 소비
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("장르: ");
        String genre = scanner.nextLine();
        System.out.print("설명: ");
        String description = scanner.nextLine();

        if (title.isEmpty() || genre.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("모든 필드를 입력해야 합니다.");
        }

        return new UpvoteModelDTO(0, title, genre, description);
    }

    public int getValidIndex(String prompt, int size) {
        System.out.print(prompt);
        int index = scanner.nextInt();
        if (index < 0 || index >= size) {
            System.out.println("잘못된 번호입니다.");
            return -1;
        }
        return index;
    }

	public void displayErrorMessage(String message) {
		// TODO Auto-generated method stub
		
	}
}
