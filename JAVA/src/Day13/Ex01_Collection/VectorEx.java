package Day13.Ex01_Collection;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		// 컬렉션 객체 생성
		// 컬렉션타입<요소타입> 변수명 = new 클래스명<요소타입>();
		
		// 벡터 객체 생성
		Vector<String> vector = new Vector<String>(10);
				
		// 요소 추가
		vector.add("아메리카노");
		vector.add("청포도에이드");
		vector.add("인크레드불");
		vector.add("초코우유");
		
		// 개수, 용량 확인
		System.out.println("개수 : " + vector.size()); // 4
		System.out.println("용량 : " + vector.capacity()); // 10
		System.out.println();
		
		
		
		
		
	}

}
