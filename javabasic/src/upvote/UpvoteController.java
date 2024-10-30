package upvote;

import java.util.List;

// 추천 항목을 관리하는 컨트롤러 클래스
public class UpvoteController {
    private UpvoteModel model; // 추천 모델
    private UpvoteView view;   // 사용자 인터페이스 뷰

    // 생성자: 모델과 뷰를 초기화하고 추천 항목을 로드
    public UpvoteController(UpvoteModel model, UpvoteView view) {
        this.model = model;
        this.view = view;
        model.loadRecommendations(); // 시작할 때 추천 항목 불러오기
    }

    // 애플리케이션 실행
    public void runApp() {
        while (true) {
            int choice = view.showMenu(); // 사용자에게 메뉴 선택 요청
            if (choice == 0) {
                System.out.println("종료합니다");
                break; // 종료 선택 시 반복문 종료
            }
            handleUserChoice(choice); // 사용자 선택 처리
        }
    }

    // 사용자 선택에 따라 적절한 메서드 호출
    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                addRec(); // 추천 항목 추가
                break;
            case 2:
                viewRec(); // 추천 목록 보기
                break;
            case 3:
                updateRec(); // 추천 항목 수정
                break;
            case 4:
                deleteRec(); // 추천 항목 삭제
                break;
            default:
                System.out.println("잘못된 선택입니다."); // 잘못된 선택 시 메시지 출력
                break;
        }
    }

    // 추천 항목 추가 메서드
    private void addRec() {
        try {
            UpvoteModelDTO rec = view.getRecommendationDetails(); // 사용자 입력받아 추천 항목 생성
            model.addRec(rec); // 추천 항목 모델에 추가
            System.out.println("추천이 추가되었습니다.");
        } catch (IllegalArgumentException e) {
            view.displayErrorMessage(e.getMessage()); // 예외 발생 시 오류 메시지 출력
        }
    }

    // 추천 목록 보기 메서드
    private void viewRec() {
        List<UpvoteModelDTO> recommendations = model.getRecs(); // 현재 추천 목록 가져오기
        view.displayRecommendations(recommendations); // 추천 목록 출력
    }

    // 추천 항목 수정 메서드
    private void updateRec() {
        int index = view.getValidIndex("수정할 추천의 번호: ", model.getRecs().size()); // 수정할 인덱스 요청
        if (index != -1) {
            try {
                UpvoteModelDTO rec = view.getRecommendationDetails(); // 사용자 입력받아 수정할 추천 항목 생성
                model.updateRec(index, rec); // 추천 항목 수정
                System.out.println("추천이 수정되었습니다.");
            } catch (IllegalArgumentException e) {
                view.displayErrorMessage(e.getMessage()); // 예외 발생 시 오류 메시지 출력
            }
        }
    }

    // 추천 항목 삭제 메서드
    private void deleteRec() {
        int index = view.getValidIndex("삭제할 추천의 번호: ", model.getRecs().size()); // 삭제할 인덱스 요청
        if (index != -1) {
            model.deleteRec(index); // 추천 항목 삭제
            System.out.println("추천이 삭제되었습니다.");
        }
    }
}
