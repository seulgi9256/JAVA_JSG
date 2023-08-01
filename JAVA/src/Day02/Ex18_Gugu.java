package Day02;

import java.util.Scanner;

public class Ex18_Gugu {

	public static void main(String[] args) {
		// 구구단(1~9단) 출력
		// 원하는 단을 입력받아 아래와 같이 구구단 수식을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(input + "*" + i + "=" + input*i);
		}
		
		sc.close();
	}

}
