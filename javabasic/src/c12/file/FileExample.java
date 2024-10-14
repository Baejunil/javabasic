package c12.file;

import java.io.File;
import java.io.IOException;

//File 클래스
//java.io 패키지에서 제공하는 File클래스는 파일 및 폴더 정보를 제공해주는
//역활을 합니다.
public class FileExample {
	public static void main(String[] args) {
		//File 객체를 생성했다고 해서 파일이나 폴더가 생성되는 것은 아닙니다.
		//그리고 제공되는 문자열 경로에 실제 파일이나 폴더가 없더라도 예외가
		//발생하지 않습니다.
		//해당 경로에 파일이나 폴더가 있는지 확인하고 싶다면 exists()메소드를
		//호출해보면 됩니다.
		//파일이나 폴더가 존재한다면 true를 리턴하고 그렇지 않으면 
		//false를 리턴합니다
		File dir=new File("C/Temp/images");
		
		if(dir.exists()==false) {
			//boolean mkdir() - 새로운 폴더를 생성합니다.
			dir.mkdirs();
		}
		
		File file1=new File("C:/Temp/file1.txt");
		File file2=new File("C:/Temp/file2.txt");
		File file3=new File("C:/Temp/file3.txt");
		
			try {
				//boolean createNewFile() - 새로운 파일을 생성합니다.
				if(file1.exists()==false) file1.createNewFile();
				if(file2.exists()==false) file2.createNewFile();
				if(file3.exists()==false) file3.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			File temp=new File("C:/Temp");
			//File[] listFiles() - 폴더에 포함된 파일 및 서브 폴더 목록 전부를
			//File배열로 리턴합니다.
			File[] contents=temp.listFiles();
			for(File file:contents) {
				//String getName() - 파일의 이름을 리턴합니다.
				System.out.println(file.getName());
			}
			
				
				
				
				
				
				
				
				
				
				
				
				
	}

}