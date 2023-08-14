package Day15;

import java.io.FileWriter;
import java.io.InputStreamReader;

public class Ex04_FileReadAndWrite {
	public static void main(String[] args) {
		
		// 직접 입력한 문자를 텍스트 파일로 출력하는 프로그램
		// 테스트 : 문자열을 입력하고 마지막에 ctrl + z 단축키 입력 (EOF)
		// EOF (End Of File) : 파일의 끝을 알려주는 키워드
		InputStreamReader is = new InputStreamReader(System.in);
		
		FileWriter fw = null;
		int data = 0;
		
		try {
			fw = new FileWriter("./src/Day15/Test3.txt");
			while( (data = is.read() ) != -1) {			// 읽고
				fw.write(data);							// 쓰고
			}
			is.close();
			fw.close();
			System.out.println("파일이 복사되었습니다.");
			System.out.println("Test.txt -> Test4.txt");
		} catch (Exception e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}

}
