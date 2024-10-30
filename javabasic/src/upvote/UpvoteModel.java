package upvote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpvoteModel {
    private List<UpvoteModelDTO> recs = new ArrayList<>();
    private RecommendationStorage storage;

    public UpvoteModel(RecommendationStorage storage) {
        this.storage = storage;
    }

    public List<UpvoteModelDTO> getRecs() {
        return Collections.unmodifiableList(recs);
    }

    public void addRec(UpvoteModelDTO rec) {
        if (rec == null) {
            throw new IllegalArgumentException("추천 항목은 null일 수 없습니다.");
        }
        recs.add(rec);
        saveRecommendations(); // 추가할 때마다 저장
    }

    public void loadRecommendations() {
        recs = storage.load();
    }

    public void saveRecommendations() {
        storage.save(recs);
    }

    public void updateRec(int index, UpvoteModelDTO rec) {
        if (index < 0 || index >= recs.size()) {
            throw new IndexOutOfBoundsException("잘못된 인덱스입니다.");
        }
        if (rec == null) {
            throw new IllegalArgumentException("추천 항목은 null일 수 없습니다.");
        }
        recs.set(index, rec);
        saveRecommendations(); // 수정할 때마다 저장
    }

    public void deleteRec(int index) {
        if (index < 0 || index >= recs.size()) {
            throw new IndexOutOfBoundsException("잘못된 인덱스입니다.");
        }
        recs.remove(index);
        saveRecommendations(); // 삭제할 때마다 저장
    }
}
