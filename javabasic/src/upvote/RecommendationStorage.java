package upvote;

import java.util.List;

// 추천 항목 저장을 위한 인터페이스
public interface RecommendationStorage {
    // 추천 항목을 저장하는 메서드
    void save(List<UpvoteModelDTO> recommendations);

    // 저장된 추천 항목을 불러오는 메서드
    List<UpvoteModelDTO> load();
}
