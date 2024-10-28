package upvote;

//DTO
public class UpvoteModelDTO {
	
		private int number;
		private String title;
		private String genre;
		private String description;
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
			this.title = title;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		@Override
		public String toString() {
			return "UpvoteModelDTO [number=" + number + ", title=" + title + ", genre=" + genre + ", description="
					+ description + "]";
		}
		
		
}
