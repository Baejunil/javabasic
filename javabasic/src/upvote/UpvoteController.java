package upvote;

import java.util.List;

public class UpvoteController {
    private UpvoteModel model;
    private UpvoteView view;

    public UpvoteController(UpvoteModel model, UpvoteView view) {
        this.model = model;
        this.view = view;
        model.loadRecommendations(); // 시작할 때 추천 항목 불러오기
    }

    public void runApp() {
        while (true) {
            int choice = view.showMenu();
            if (choice == 0) {
                System.out.println("종료합니다");
                break;
            }
            handleUserChoice(choice);
        }
    }

    private void handleUserChoice(int choice) {
        switch (choice) {
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
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
    }

    private void addRec() {
        try {
            UpvoteModelDTO rec = view.getRecommendationDetails();
            model.addRec(rec);
            System.out.println("추천이 추가되었습니다.");
        } catch (IllegalArgumentException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private void viewRec() {
        List<UpvoteModelDTO> recommendations = model.getRecs();
        view.displayRecommendations(recommendations);
    }

    private void updateRec() {
        int index = view.getValidIndex("수정할 추천의 번호: ", model.getRecs().size());
        if (index != -1) {
            try {
                UpvoteModelDTO rec = view.getRecommendationDetails();
                model.updateRec(index, rec);
                System.out.println("추천이 수정되었습니다.");
            } catch (IllegalArgumentException e) {
                view.displayErrorMessage(e.getMessage());
            }
        }
    }

    private void deleteRec() {
        int index = view.getValidIndex("삭제할 추천의 번호: ", model.getRecs().size());
        if (index != -1) {
            model.deleteRec(index);
            System.out.println("추천이 삭제되었습니다.");
        }
    }
}
