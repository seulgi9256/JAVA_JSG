package 과제;

public class ThreeSixNine {
	
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int one = i%10;  // 1의 자리
			int ten = i/10;  // 10의 자리
			
			boolean one369 = (one == 3 || one ==6 || one ==9);
			boolean ten369 = (ten == 3 || ten ==6 || ten ==9);
			

			if(one369&&ten369) {
				System.out.println("**");
				
			}
			else if(one369||ten369) {
				System.out.println("*");
			}
			else
				System.out.println(i);
			
		}
		
	}

}