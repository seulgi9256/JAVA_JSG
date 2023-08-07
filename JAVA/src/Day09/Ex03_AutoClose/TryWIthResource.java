package Day09.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWIthResource {
	
	public static void main(String[] args) {
//		FileInputStream fis = null;
		// test.txt 파일을 입력받는 객체
		// try( 자동으로 자원해제할 객체 생성 ) {  }
		// : finally 구문에서 close() 하지 않아도, 자동으로 자원해제를 해준다.
		// AutoClosable 인터페이스를 구현한 클래스이어야 자동으로 자원 해제 가능
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			
			int read = 0;
			while((read = fis.read())!=-1) {
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력 관련 예외 발생");
		} 
//			finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
