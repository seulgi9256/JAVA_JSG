package Day02;

public class Ex15_OddEven {

	public static void main(String[] args) {
		// 1~20 까지의 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		// 1 3 5 7 9 11 13 15 17 19 > 100
		// 2 4 6 8 10 12 14 16 18 20 > 110
		
		int num = 1;
		int sum1=0; // 짝수
		int sum2=0; // 홀수
		
		while(num<=20) {
			if(num%2==0) sum1+=num;
			
			else sum2+=num;
		num++;
		}
		System.out.println("짝수의 합계 : " + sum1);
		System.out.println("홀수의 합계 : " + sum2);
	}

}
