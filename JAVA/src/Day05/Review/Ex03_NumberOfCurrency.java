package Day05.Review;

import java.util.Scanner;

/*
 * 화폐 매수 구하기
 * 
 * 금액				: 537620
 * 50000			: 10			
 * 10000 			: 3				
 * 5000				: 1
 * 1000				: 2
 * 500				: 1
 * 100				: 1
 * 50				: 0
 * 10				: 2
 * 5				: 0
 * 1				: 0
 * 위와 같이 금액을 입력하면,
 * 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를
 * 출력하는 프로그램을 작성하시오.
 */
public class Ex03_NumberOfCurrency {

	/*
	 * (순서도)
	 * 1. 필요한 변수 선언
	 * - (입력금액), (화폐매수), (화폐단위)
	 * 
	 * 2. (입력금액) 입력
	 * 
	 * 3. 화폐매수 계산
	 * [조건] : 큰 화폐 단위부터 계산한다.
	 * 3-1. 화폐매수 계산
	 * 		10 = 537620 / 50000
	 * 3-2. 잔액 계산
	 * 1) 잔 액 = 입력금액 - 화폐단위*화폐매수
	 * 2) 잔 액 = 입력금액 % 화폐단위
	 * 
	 * 3-3. 화폐단위 변환
	 * 번갈아 가면서, /5, /2 연산을 반복한다.
	 * (화폐단위) = (화폐단위) /5
	 * (화폐단위) = (화폐단위) /2
	 * 
	 * 4. 3번의 과정을 반복
	 * - 반복조건 : (화폐단위)가 1보다 크거나 같으면 반복
	 * 
	 * 5. 3-1에서 구한 화폐매수를 출력한다.
	 */
	public static void main(String[] args) {
		
		int input;	// 입력금액
		int count;					// 화폐매수
		int money = 50000; 			// 화폐단위 - 큰 화폐단위부터 시작
		boolean sw = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();
		
		while(money >=1) {
		count = input/money;	// 화폐매수
		System.out.println(money + " \t : " + count + "개");
		
		input = input % money;  // 잔액
		
		if(sw) {
		money = money / 5;
		}
		else {
		money = money / 2;
		}
		sw = !sw; // !(NOT) 연산 : true -> false, false -> true
		

	}		sc.close();
	}
	

}
