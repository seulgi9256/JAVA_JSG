package Day02;

public class Ex19_GuguAll {

	public static void main(String[] args) {
		
		for(int a=1; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				System.out.print(a + "*" + b + "=" + a*b);
				System.out.print("\t"); // 탭(공백)
			}
			 System.out.println(); // 한 단 끝 ---> 다음줄로 줄바꿈
		}
	}

}
