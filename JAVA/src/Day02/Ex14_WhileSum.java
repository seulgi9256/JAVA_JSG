package Day02;

public class Ex14_WhileSum {

	public static void main(String[] args) {
		// 1부터 100까지 합계
		
		int a = 1;
		int sum = 0;
		
		while(a <= 100) {
			sum += a++;
			/*
			sum=sum+a;
			a++;*/
		}
		
		System.out.println("합계 : " + sum);
	}

}
