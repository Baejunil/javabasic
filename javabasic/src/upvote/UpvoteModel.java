package upvote;

import java.util.ArrayList;
import java.util.List;

public class UpvoteModel {
	private List<UpvoteModelDTO> recs=new ArrayList<>();
	//추천 항목 반환
	public List<UpvoteModelDTO> getrecs(){
		return recs;
	}
	//추천 리스트 추가
	public void addRec(UpvoteModelDTO rec) {
		recs.add(rec);
	}
	// 추천 항목 수정
    public void updateRec(int index, UpvoteModelDTO rec) {
        if (index >= 0 && index < recs.size()) {
            recs.set(index, rec);
        }
    }

    // 추천 항목 삭제
    public void deleteRec(int index) {
        if (index >= 0 && index < recs.size()) {
            recs.remove(index);
        }
    }
	
	
}
