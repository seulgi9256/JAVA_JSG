

package Day03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최솟값을 구하여 출력하시오.
		// 입력예시
		// 5
		// 90 60 70 100 55
		// 출력예시
		// 최솟값 55

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력할 개수 N 입력
		int arr[] = new int [N];
		int min = Integer.MAX_VALUE; 	
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];	
			}
		}
		System.out.println("최솟값은 : " + min);
		sc.close();

	}


}
