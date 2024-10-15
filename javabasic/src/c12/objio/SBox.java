package c12.objio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//IO 스트림 기반의 인스턴스 저장
//인스턴스를 저장하는 라이브러리
//ObjectInputStream & ObjectOutputStream
public class SBox {
	public static void main(String[] args) {
		//ObjectInputStream
		//인스턴스를 입력하는 스트림 : 인스턴스 직렬화
		//주요 메소드
		//public final Object readObject() throws
		//IOException, ClassNotFoundException
		try {
			ObjectInputStream ois=new ObjectInputStream(
					new FileInputStream("C:/Temp/Object.bin"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//ObjectOutputStream
		//인스턴스를 출력하는 스트림 : 인스턴스 역직렬화
		//주요  메소드
		//public final void writeObject(Object obj)
		//throws IOException
		try {
			ObjectOutputStream ois=new ObjectOutputStream(
					new FileOutputStream("C:/Temp/Object.bin"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}