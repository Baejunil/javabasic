package upvote;

import java.util.Scanner;

public class UpvoteMain {
	public static void main(String[] args) {
        // 모델, 뷰, 컨트롤러 초기화
        UpvoteModel model = new UpvoteModel();
        UpvoteView view = new UpvoteView(new Scanner(System.in)); // Scanner 객체를 뷰에 전달
        UpvoteController controller = new UpvoteController(model, view);

        // 애플리케이션 실행
        controller.runApp();
    }
}