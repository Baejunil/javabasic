package upvote;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// 파일에 추천 항목을 저장하고 불러오는 클래스
public class FileRecommendationStorage implements RecommendationStorage {
    private String filename; // 저장할 파일 이름

    // 생성자: 파일 이름을 받아 초기화
    public FileRecommendationStorage(String filename) {
        this.filename = filename;
    }

    // 추천 항목을 파일에 저장하는 메서드
    @Override
    public void save(List<UpvoteModelDTO> recommendations) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(recommendations); // 추천 항목을 직렬화하여 파일에 기록
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
        }
    }

    // 파일에서 추천 항목을 불러오는 메서드
    @Override
    public List<UpvoteModelDTO> load() {
        List<UpvoteModelDTO> recommendations = new ArrayList<>(); // 추천 항목을 저장할 리스트
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            recommendations = (List<UpvoteModelDTO>) ois.readObject(); // 파일에서 추천 항목을 역직렬화하여 읽기
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // 예외 발생 시 스택 트레이스를 출력
        }
        return recommendations; // 불러온 추천 항목 리스트 반환
    }
}
