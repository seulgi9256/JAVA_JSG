package Day01;

import java.util.Scanner;

public class Ex11_Boolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전원 : ");

		// boolean : true(참), false(거짓) 논리값만 가지는 자료형
		boolean on = sc.nextBoolean();
		System.out.println("on : " + on);

		
		if(on) {
			System.out.println("전원 ON");
		}
		else {
			System.out.println("전원 OFF");
		}
		sc.close();
	}

}
