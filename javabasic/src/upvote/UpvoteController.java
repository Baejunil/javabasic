package upvote;

import java.util.List;
import java.util.Scanner;

public class UpvoteController {
    private UpvoteModel model;
    private UpvoteView view;
    private Scanner scanner; // 사용자 입력을 위한 스캐너

    // 생성자에서 모델과 뷰를 초기화
    public UpvoteController(UpvoteModel model, UpvoteView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in); // 스캐너 초기화
    }

    // 애플리케이션 실행
    public void runApp() {
        try {
            while (true) {
                int choice = showMenu(); // 메뉴 보여주기
                switch (choice) {
                    case 0:
                        System.out.println("종료합니다");
                        return;
                    case 1:
                        addRec();
                        break;
                    case 2:
                        viewRec();
                        break;
                    case 3:
                        updateRec();
                        break;
                    case 4:
                        deleteRec();
                        break;
                    case 5:
                        setTestData();
                        break;
                    default:
                        System.out.println("잘못된 선택입니다");
                }
            }
        } finally {
            scanner.close(); // 스캐너 닫기
        }
    }

    // 메뉴 메서드
    private int showMenu() {
        System.out.println("(만화, 애니, 게임) 통합 추천 메뉴:");
        System.out.println("0. 종료");
        System.out.println("1. 추천 추가");
        System.out.println("2. 추천 목록 보기");
        System.out.println("3. 추천 수정");
        System.out.println("4. 추천 삭제");
        System.out.println("5. 테스트 데이터 추가");
        System.out.print("선택: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            scanner.next(); // 잘못된 입력은 무시하고 다시 받음
        }
        return scanner.nextInt();
    }

    // 추천 추가
    private void addRec() {
        UpvoteModelDTO rec = createRecFromInput();
        model.addRec(rec);
        System.out.println("추천이 추가되었습니다.");
    }

    // 추천 목록 보기
    private void viewRec() {
        List<UpvoteModelDTO> recommendations = model.getRecs();
        if (recommendations.isEmpty()) {
            System.out.println("추천 목록이 비어 있습니다.");
        } else {
            view.displayRecommendations(recommendations); // 뷰에 추천 목록 표시
        }
    }

    // 추천 수정
    private void updateRec() {
        System.out.print("수정할 추천의 번호: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= model.getRecs().size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        UpvoteModelDTO rec = createRecFromInput();
        model.updateRec(index, rec);
        System.out.println("추천이 수정되었습니다.");
    }

    // 추천 삭제
    private void deleteRec() {
        System.out.print("삭제할 추천의 번호: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= model.getRecs().size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        model.deleteRec(index);
        System.out.println("추천이 삭제되었습니다.");
    }

    // 추천 항목 생성 메서드
    private UpvoteModelDTO createRecFromInput() {
        System.out.print("제목: ");
        String title = scanner.next();
        System.out.print("장르: ");
        String genre = scanner.next();
        System.out.print("설명: ");
        String description = scanner.next();
        
        int number = model.getRecs().size(); // 현재 추천 개수
        UpvoteModelDTO rec = new UpvoteModelDTO(number, title, genre, description);
        return rec;
    }

    // 테스트 데이터 설정
    private void setTestData() {
        model.addRec(new UpvoteModelDTO(0, "테스트 제목 1", "테스트 장르 1", "테스트 설명 1"));
        model.addRec(new UpvoteModelDTO(1, "테스트 제목 2", "테스트 장르 2", "테스트 설명 2"));
        model.addRec(new UpvoteModelDTO(2, "테스트 제목 3", "테스트 장르 3", "테스트 설명 3"));
        System.out.println("테스트 데이터가 추가되었습니다.");
    }
}
