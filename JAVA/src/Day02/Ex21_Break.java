package Day02;

import java.util.Scanner;

public class Ex21_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 무한 루프
		// : 반드시 종료조건을 추가해주어야한다. (break)
		while(true) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("STOP"))
			break;
			
			System.out.println(">>" + str);
			
		}
		System.out.println("프로그램을 종료합니다...");
		sc.close();
	}

}
