package c12.copymove;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//파일 및 디렉토리의 복사와 이동
//복사 메소드
//public static Path copy(Path source,Path target,
// CopyOption ...options) throws IOException
//옵션
//REPLACE_EXISTING : 이미 파일이 존재한다면 해당 파일을 대체한다.
//COPY_ATTRIBUTES : 파일의 속성까지 복사를 한다.

//이동 메소드
//public static Path move(Path source,Path target,
//CopyOption ...options) throws IOException
//옵션
//REPLACE_EXISTING : 이미 파일이 존재한다면 해당 파일을 대체한다.
public class CopyFileFromFiles {
	public static void main(String[] args) {
		Path src = Paths.get("C:/Temp/simple.txt");
		Path dst = Paths.get("C:/Temp/simple2.txt");
		
		try {
			//src가 지시하는 파일을 dst가 지시하는 위치와 이름으로 복사
			Files.copy(
				src, dst,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//C:/Temp/SubTemp 폴더를 생성
		Path srcMove = Paths.get("C:/Temp/simple2.txt");
		Path dstMove = Paths.get("C:/Temp/SubTemp/simple2.txt");
		
		//srcMove가 지시하는 디렉토리를 dstMove가 지시하는 디렉토리로 이동
		try {
			Files.move(srcMove, dstMove,
				StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}