package 과제;

public class Sort_Test {

	public static void main(String[] args) {
		// 공식 : (int) (Math.random() * [개수] + [시작숫자])
	//	int random = (int) (Math.random() * 45 + 1);
		
//		// 1~20 사이의 랜덤 수
//		int rand1 = (int)Math.random() * 20 + 1;
//		System.out.println("rand1 : " + rand1);
	//	
//		// -20~20 사이의 랜덤수
//		int rand2 = (int)Math.random() * 41 - 20;
//		System.out.println("rand2 : " + rand2);
		
		int lotto[] = new int[6];
		// 1~45 사이의 6개 랜덤 수를, 중복을 제거하고 오름차순으로 정렬
		for(int i = 0; i <6 ; i++) {
			int num = (int)(Math.random()*45+1);
			lotto[i] = num;
			// 중복제거
			for(int j=0; j<i; j++) {
				if(num==lotto[j])
					i--;
			}

		}	
		
		// 오름차순 정렬
		// 1. 1번째 요소를 선택, 나머지 요소들과 비교
		// 2. (선택요소) > (비교요소) -> 교환
		for (int i = 1; i < lotto.length; i++) {
			for (int j = i; j < i; j--) {
				// 선택 요소 : lotto[i]
				// 비교 요소 : lotto[j]
				if(lotto[j] > lotto[j+1]) {
					// 두 요소를 교환
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
				
			}
		}
		System.out.println();
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
	}
	
