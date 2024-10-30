package upvote;

import java.util.List;

public interface RecommendationStorage {
    void save(List<UpvoteModelDTO> recommendations);
    List<UpvoteModelDTO> load();
}
