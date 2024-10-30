package upvote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 추천 모델 클래스
public class UpvoteModel {
    private List<UpvoteModelDTO> recs = new ArrayList<>(); // 추천 항목 목록
    private RecommendationStorage storage; // 추천 항목을 저장하고 로드하기 위한 스토리지

    // 생성자: 추천 항목을 저장할 스토리지 초기화
    public UpvoteModel(RecommendationStorage storage) {
        this.storage = storage;
    }

    // 추천 목록 반환 (변경 불가 리스트)
    public List<UpvoteModelDTO> getRecs() {
        return Collections.unmodifiableList(recs);
    }

    // 추천 항목 추가
    public void addRec(UpvoteModelDTO rec) {
        if (rec == null) {
            throw new IllegalArgumentException("추천 항목은 null일 수 없습니다.");
        }
        recs.add(rec);
        saveRecommendations(); // 추가할 때마다 추천 목록 저장
    }

    // 추천 목록 로드
    public void loadRecommendations() {
        recs = storage.load(); // 스토리지에서 추천 항목 불러오기
    }

    // 추천 목록 저장
    public void saveRecommendations() {
        storage.save(recs); // 현재 추천 항목 목록을 스토리지에 저장
    }

    // 추천 항목 수정
    public void updateRec(int index, UpvoteModelDTO rec) {
        if (index < 0 || index >= recs.size()) {
            throw new IndexOutOfBoundsException("잘못된 인덱스입니다.");
        }
        if (rec == null) {
            throw new IllegalArgumentException("추천 항목은 null일 수 없습니다.");
        }
        recs.set(index, rec);
        saveRecommendations(); // 수정할 때마다 추천 목록 저장
    }

    // 추천 항목 삭제
    public void deleteRec(int index) {
        if (index < 0 || index >= recs.size()) {
            throw new IndexOutOfBoundsException("잘못된 인덱스입니다.");
        }
        recs.remove(index);
        saveRecommendations(); // 삭제할 때마다 추천 목록 저장
    }
}
