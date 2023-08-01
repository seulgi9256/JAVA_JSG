package Day01;

import java.util.Scanner;

public class Ex14_Intro {

	public static void main(String[] args) {
		System.out.println("이름, 나이, 키, 주소를 공백을 두고 입력해보세요");
		
		Scanner sc = new Scanner(System.in);
		// String : 문자열을 표현하는 참조 자료형
		// String 변수 = "문자열"
		String name = sc.next();
		System.out.println("이름 : " + name); // 문자열 입력
		
		int age = sc.nextInt();
		System.out.println("나이 : " + age); // 정수 하나 입력
		
		double height = sc.nextDouble();
		System.out.println("키 : " + height); // 실수 하나 입력
		
		String address = sc. nextLine();
		System.out.println("주소 : " + address); // 문자열 한 줄 입력
		
		sc.close();	
		
		
	}

}
