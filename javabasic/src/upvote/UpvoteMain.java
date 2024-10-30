package upvote;

import java.util.Scanner;

public class UpvoteMain {
    public static void main(String[] args) {
        RecommendationStorage storage = new FileRecommendationStorage("recommendations.dat");
        UpvoteModel model = new UpvoteModel(storage);
        UpvoteView view = new UpvoteView(new Scanner(System.in));
        UpvoteController controller = new UpvoteController(model, view);
        controller.runApp();
    }
}
