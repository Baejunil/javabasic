package upvote;

import java.io.Serializable;

// 추천 항목을 나타내는 데이터 전송 객체 (DTO)
public class UpvoteModelDTO implements Serializable {
    private static final long serialVersionUID = 1L; // 직렬화 버전 관리
    private int number; // 추천 번호
    private String title; // 애니메이션 제목
    private String genre; // 애니메이션 장르
    private String description; // 애니메이션 설명

    // 생성자: 추천 항목의 필드를 초기화
    public UpvoteModelDTO(int number, String title, String genre, String description) {
        this.number = number;
        this.title = title;
        this.genre = genre;
        this.description = description;
    }

    // 추천 번호의 getter 메서드
    public int getNumber() {
        return number;
    }

    // 추천 번호의 setter 메서드
    public void setNumber(int number) {
        this.number = number;
    }

    // 제목의 getter 메서드
    public String getTitle() {
        return title;
    }

    // 제목의 setter 메서드
    public void setTitle(String title) {
        // 제목이 비어있으면 예외 발생
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("제목은 비어 있을 수 없습니다.");
        }
        this.title = title;
    }

    // 장르의 getter 메서드
    public String getGenre() {
        return genre;
    }

    // 장르의 setter 메서드
    public void setGenre(String genre) {
        // 장르가 비어있으면 예외 발생
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException("장르는 비어 있을 수 없습니다.");
        }
        this.genre = genre;
    }

    // 설명의 getter 메서드
    public String getDescription() {
        return description;
    }

    // 설명의 setter 메서드
    public void setDescription(String description) {
        // 설명이 비어있으면 예외 발생
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("설명은 비어 있을 수 없습니다.");
        }
        this.description = description;
    }

    // 추천 항목의 정보를 문자열로 반환
    @Override
    public String toString() {
        return "UpvoteModelDTO [추천번호=" + number + ", 제목=" + title + ", 장르=" + genre + ", 스토리설명=" + description + "]";
    }
}
