package upvote;

import java.util.List;
import java.util.Scanner;

public class UpvoteController {
    private UpvoteModel model;
    private UpvoteView view;
    private Scanner scanner;

    // 생성자에서 모델과 뷰를 초기화
    public UpvoteController(UpvoteModel model, UpvoteView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    // 애플리케이션 실행
    public void runApp() {
        while (true) {
            int choice = showMenu();
            if (choice == 0) {
                System.out.println("종료합니다");
                break;
            }
            handleUserChoice(choice);
        }
        scanner.close();
    }

    // 메뉴 메서드
    private int showMenu() {
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

    // 사용자 선택 처리
    private void handleUserChoice(int choice) {
        if (choice == 1) {
            addRec();
        } else if (choice == 2) {
            viewRec();
        } else if (choice == 3) {
            updateRec();
        } else if (choice == 4) {
            deleteRec();
        } else {
            System.out.println("잘못된 선택입니다");
        }
    }

    // 추천 추가
    private void addRec() {
        model.addRec(createRecFromInput());
        System.out.println("추천이 추가되었습니다.");
    }

    // 추천 목록 보기
    private void viewRec() {
        List<UpvoteModelDTO> recommendations = model.getRecs();
        if (recommendations.isEmpty()) {
            System.out.println("추천 목록이 비어 있습니다. 테스트 데이터를 추가합니다.");
            setTestData();
            recommendations = model.getRecs();
        }
        view.displayRecommendations(recommendations);
    }

    // 추천 수정
    private void updateRec() {
        int index = getValidIndex("수정할 추천의 번호: ");
        if (index != -1) {
            model.updateRec(index, createRecFromInput());
            System.out.println("추천이 수정되었습니다.");
        }
    }

    // 추천 삭제
    private void deleteRec() {
        int index = getValidIndex("삭제할 추천의 번호: ");
        if (index != -1) {
            model.deleteRec(index);
            System.out.println("추천이 삭제되었습니다.");
        }
    }

    // 추천 항목 생성 메서드
    private UpvoteModelDTO createRecFromInput() {
        System.out.print("제목: ");
        String title = scanner.next();
        System.out.print("장르: ");
        String genre = scanner.next();
        System.out.print("설명: ");
        String description = scanner.next();
        return new UpvoteModelDTO(model.getRecs().size(), title, genre, description);
    }

    // 유효한 인덱스 가져오기
    private int getValidIndex(String prompt) {
        System.out.print(prompt);
        int index = scanner.nextInt();
        if (index < 0 || index >= model.getRecs().size()) {
            System.out.println("잘못된 번호입니다.");
            return -1;
        }
        return index;
    }

    // 테스트 데이터 설정
    private void setTestData() {
        for (int i = 1; i <= 3; i++) {
            model.addRec(new UpvoteModelDTO(i - 1, "테스트 제목 " + i, "테스트 장르 " + i, "테스트 설명 " + i));
        }
    }
}
