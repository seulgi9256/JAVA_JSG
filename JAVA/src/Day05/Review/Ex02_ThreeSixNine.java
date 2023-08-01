package Day05.Review;

public class Ex02_ThreeSixNine {
	
	public static void main(String[] args) {
		// 정수 1~100 까지 반복하면서,
		// 해당 수가 3 또는 6 또는 9 일 때, 
		// 369가 되는 개수 만큼 "*"을 출력하는 프로그램을 작성하시오.
		// ex) 3 -----> "*"
		//     39 ----> "**"
		//     40 ----> 40

		
		for(int i=1; i<=100; i++) {
			int one = i%10; 
			int ten = i/10;
			
			boolean one369 = (one == 3 || one ==6 || one ==9);
			boolean ten369 = (ten == 3 || ten ==6 || ten ==9);			

			if(one369 && ten369) {
				System.out.println("**");
				
			}
			else if(one369 || ten369) {
				System.out.println("*");
			}
			else
				System.out.println(i);
		}
	}

}
