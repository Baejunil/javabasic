package upvote;

import java.util.Scanner;

// 애플리케이션의 진입점인 메인 클래스
public class UpvoteMain {
    public static void main(String[] args) {
        // 추천 항목을 파일에 저장하기 위한 RecommendationStorage 구현체 생성
        RecommendationStorage storage = new FileRecommendationStorage("recommendations.dat");
        
        // 모델을 초기화하고 스토리지 설정
        UpvoteModel model = new UpvoteModel(storage);
        
        // 사용자 입력을 처리하기 위한 뷰 초기화
        UpvoteView view = new UpvoteView(new Scanner(System.in));
        
        // 모델과 뷰를 연결하는 컨트롤러 초기화
        UpvoteController controller = new UpvoteController(model, view);
        
        // 애플리케이션 실행
        controller.runApp();
    }
}
