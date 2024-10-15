package trywithresources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//try-with-resource
//예외 처리 구문
//자바 7버전에서 새롭게 업데이트
public class TryWithResources {
	public static void main(String[] args){
		//자바7번 이전의 try-catch-finally
		//사용 후에 반납해주어야 하는 자원들은 Closable 인터페이스를 구현하고
		//있으며, 사용 후에 close 메소드를 호출해주어야 했다.
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("C:/Temp/file.txt");
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//자바 7번 부터 try-with-resources
		//자바는 이러한 문제점을 해결하고자 자바7부터 자원을 자동으로 반납해주는
		//try-with-resource 문법을 추가하였다.
		try(FileInputStream fis=new FileInputStream("file.txt");){
			fis.read();
			//try 구문을 빠져 나갈 때 다음 문장을 안정적으로 자동 실행
			//fis.close();
			//try-with-resources 기반의 오픈 및 종료 대상이 되기 위한 조건
			//java.lang.AutoCloseable 인터페이스를 구현
			//AutoCloseable은 Closeable의 상위 클래스입니다.
		}catch(Exception e) {
			e.printStackTrace();
		}
		//new 키워드가 두개이상인 경우
		try(
			FileInputStream fis=new FileInputStream("file.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
		){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}