package upvote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpvoteModel {
    private List<UpvoteModelDTO> recs = new ArrayList<>();

    // 추천 항목 반환 (안전한 복사본 반환)
    public List<UpvoteModelDTO> getRecs() {
        return Collections.unmodifiableList(recs); // 리스트의 변경 방지
    }

    // 추천 리스트 추가
    public void addRec(UpvoteModelDTO rec) {
        if (rec == null) {
            throw new IllegalArgumentException("추천 항목은 null일 수 없습니다.");
        }
        recs.add(rec);
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
    }

    // 추천 항목 삭제
    public void deleteRec(int index) {
        if (index < 0 || index >= recs.size()) {
            throw new IndexOutOfBoundsException("잘못된 인덱스입니다.");
        }
        recs.remove(index);
    }
}
