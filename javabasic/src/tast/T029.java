package tast;

public class T029 {
	// 1번문제
	/*
	 *  import java.util.ArrayList;
		import java.util.List;
		
		public class BoardDao {
		    public List<Board> getBoardList() {
		        List<Board> list = new ArrayList<>();
		
		        // 예시로 몇 개의 게시물 추가
		        list.add(new Board("제목1", "내용1"));
		        list.add(new Board("제목2", "내용2"));
		        list.add(new Board("제목3", "내용3"));
		
		        return list;
    }
}
	 */
	
	//2번 문제
	/*
	 * 	 public class Student {
		    public int studentNum;
		    public String name;
		
		    public Student(int studentNum, String name) {
		        this.studentNum = studentNum;
		        this.name = name;
		    }
		
		    @Override
		    public int hashCode() {
		        return Integer.hashCode(studentNum); // 학번을 해시 코드로 사용
		    }
		
		    @Override
		    public boolean equals(Object obj) {
		        if (this == obj) return true; // 동일한 객체일 경우
		        if (obj == null || getClass() != obj.getClass()) return false; // null 체크 및 클래스 체크
		        
		        Student other = (Student) obj; // 타입 캐스팅
		        return studentNum == other.studentNum; // 학번이 같으면 동일한 객체
		    }
		}
	 */
}
