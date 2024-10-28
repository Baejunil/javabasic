package upvote;

import java.util.List;
import java.util.Scanner;

public class UpvoteController {
    private UpvoteModel model;
    private UpvoteView view;
    private Scanner scanner;   // 사용자 입력을 위한 스캐너

    // 생성자에서 모델과 뷰를 초기화
    public UpvoteController(UpvoteModel model, UpvoteView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in); // 스캐너 초기화
    }

    // 애플리케이션 실행
    public void runApp() {
        while (true) {
            // 메뉴 보여주기
            int choice = showMenu();
            switch (choice) {
                case 0:
                    System.out.println("종료합니다");
                    return;
                case 1:
                    addrec();
                    break;
                case 2:
                    viewrec();
                    break;
                case 3:
                    updaterec();
                    break;
                case 4:
                    delterec();
                    break;
                case 5:
                    setTestData();
                    break;
                default:
                    System.out.println("잘못된 선택입니다");
            }
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
        return scanner.nextInt();
    }

    // 추천 추가
    private void addrec() {
        System.out.print("제목: ");
        String title = scanner.next();
        System.out.print("장르: ");
        String genre = scanner.next();
        System.out.print("설명: ");
        String desString = scanner.next();

        int number = model.getrecs().size(); // 현재 추천 개수
        UpvoteModelDTO rec = new UpvoteModelDTO();
        rec.setNumber(number);
        rec.setTitle(title);
        rec.setGenre(genre);
        rec.setDescription(desString);
        model.addRec(rec);

        System.out.println("추천이 추가되었습니다.");
    }

    // 추천 목록 보기
    private void viewrec() {
        List<UpvoteModelDTO> recommendations = model.getrecs();
        if (recommendations.isEmpty()) {
            System.out.println("추천 목록이 비어 있습니다.");
        } else {
            view.displayRecommendations(recommendations); // 뷰에 추천 목록 표시
        }
    }

    // 추천 수정
    private void updaterec() {
        System.out.print("수정할 추천의 번호: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= model.getrecs().size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        System.out.print("새 제목: ");
        String title = scanner.next();
        System.out.print("새 장르: ");
        String genre = scanner.next();
        System.out.print("새 설명: ");
        String description = scanner.next();

        UpvoteModelDTO rec = new UpvoteModelDTO();
        rec.setNumber(index);
        rec.setTitle(title);
        rec.setGenre(genre);
        rec.setDescription(description);
        model.updateRec(index, rec);

        System.out.println("추천이 수정되었습니다.");
    }

    // 추천 삭제
    private void delterec() {
        System.out.print("삭제할 추천의 번호: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= model.getrecs().size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        model.deleteRec(index);
        System.out.println("추천이 삭제되었습니다.");
    }

    // 테스트 데이터 설정
    private void setTestData() {
        addrec("Attack on Titan", "Action", "Humans vs Titans");
        addrec("My Neighbor Totoro", "Fantasy", "A story of friendship");
        addrec("The Witcher", "Fantasy", "Monster hunting adventures");
        System.out.println("테스트 데이터가 추가되었습니다.");
    }
}
