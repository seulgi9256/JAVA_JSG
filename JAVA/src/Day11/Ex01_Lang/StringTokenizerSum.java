package Day11.Ex01_Lang;

import java.util.StringTokenizer;

public class StringTokenizerSum {
	
	// "1,2,3,4,5"
	// "," 분리 --> 1 2 3 4 5 (String)
	// 토큰을 int 타입으로 변환하여 합계를 구해보자.
	public static void main(String[] args) {
		
		String str = "1,2,3,4,5";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int sum = 0;
	
		while( st.hasMoreTokens() ) {
			int k = Integer.parseInt( st.nextToken() );
			sum+=k;
		}
			System.out.print("합계 : " + sum);
	}
	
}


