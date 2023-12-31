package Day05.Review;

import java.util.Scanner;

/*
 * ########## 메 뉴 판 #########
 * 1. 굽네치킨 - 볼케이노 치킨
 * 2. BBQ - 황금올리브 반반 치킨
 * 3. 교촌치킨 - 허니콤보 치킨
 * 4. BHC - 뿌링클 치킨
 * 5. 레드락 치킨 - 양념 치킨
 * 0. 종료
 * ########## 입력 :
 * 
 * 메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
 * "(해당메뉴) 이 주문이 되었습니다." 라고 출력하시오.
 *  0을 입력하기 전까지 반복하고,
 *  0을 입력하면 반복을 종료합니다
 *  종료 시, "?개의 주문을 완료합니다."라고 출력하시오.
 */
public class Ex07_ChickenMenu_test {

	public static void main(String[] args) {
		int menuNo = 0;
		int count = 0;
		String menuName = "";

		
		Scanner sc = new Scanner(System.in);

		do {
			
			Menu(); // 메뉴 출력 메소드
			menuNo = sc.nextInt(); // 메뉴번호 입력

			
			menuName = select(menuNo); // 메뉴 선택 메소드
	
			// 메뉴번호 유효성 검사
			if(menuNo >= 1 && menuNo <=5) {
				System.out.println(menuName + "이 주문이 되었습니다.");
				System.out.println();
				count++;
			}
			
			}
		while(menuNo !=0);
		System.out.println(count + "개의 주문을 완료합니다.");
		sc.close();
	
}

// 메뉴 출력 메소드
public static void Menu() {
	System.out.println("#### 점심 메뉴판 ####");
	System.out.println("1. 굽네치킨 - 볼케이노 치킨");
	System.out.println("2. BBQ - 황금올리브 반반 치킨");
	System.out.println("3. 교촌치킨 - 허니콤보 치킨");
	System.out.println("4. BHC - 뿌링클 치킨");
	System.out.println("5. 레드락 치킨 - 양념치킨");
	System.out.println("0. 종료");
	System.out.print("메뉴번호 : ");
	
}

//메뉴 선택 메소드
public static String select(int menuNo) {
	String menuName = "";
	
	switch(menuNo) {
	case 1 :menuName = "굽네치킨 - 볼케이노 치킨"; break;
	case 2 :menuName = "BBQ - 황금올리브 반반 치킨"; break;
	case 3 :menuName = "교촌치킨 - 허니콤보 치킨"; break;
	case 4 :menuName = "BHC - 뿌링클 치킨"; break;
	case 5 :menuName = "레드락 치킨 - 양념치킨"; break;
	default : break;
	}
	
	return menuName;
}

}