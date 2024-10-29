package upvote;

// DTO
public class UpvoteModelDTO {
    private int number;
    private String title;
    private String genre;
    private String description;

    // 생성자
    public UpvoteModelDTO(int number, String title, String genre, String description) {
        this.number = number;
        this.title = title;
        this.genre = genre;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("제목은 비어 있을 수 없습니다.");
        }
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException("장르는 비어 있을 수 없습니다.");
        }
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("설명은 비어 있을 수 없습니다.");
        }
        this.description = description;
    }

    @Override
    public String toString() {
        return "UpvoteModelDTO [number=" + number + ", title=" + title + ", genre=" + genre + ", description=" + description + "]";
    }
}