package c12.ni02;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//Paths 와 Path 클래스
//java.nio.file.Path 위치에 있다
//자바 1.7(7)에서 파일 및 디렉토리의 경로 표현을 위해 추가된 인터페이스
//java.nio.file.files의 메소드들
//createFile() - 지정한 경로에 빈 파일 생성, 경로가 유효하지 않거나
//파일이 존재하면 예외 발생
//createDirectory() - 지정한 경로에 디렉토리 생성, 경로가 유효하지 않으면
//예외 발생
//createDirectories() - 지정한 경로의 모든 디렉토리 생성
//리턴 타입은 Path로 리턴합니다.
//List<String> readAllLines(Path path) - 모든 문자를 읽습니다.
//Path write(Path path) - 모든 문자를 출력합니다.
public class SimpleTxtWriteRead {
	public static void main(String[] args) {
		//문자 데이터의 간단한 입력 및 출력의 예
		Path fp=Paths.get("C:/Temp/simple.txt");
		String st1="One Simple String";
		String st2="Two Simple String";
		List<String> lst1=new ArrayList<>();
		lst1.add(st1);
		lst1.add(st2);
		
		try {
			Files.write(fp, lst1);
			System.out.println("파일로 저장이 되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}