package Day13.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	
	public static void printList(List<?> list) {
		
		Iterator<?> it = list.iterator();
		
		while(it.hasNext()) {
			Object item = it.next();
			System.out.print(item);
			if(it.hasNext()) System.out.print(", "); // 뒤에 남아있는 요소가 있으면
			else System.out.println();
		}
		
	}
	
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
		
		// 검색
		// 반복 방법1
		System.out.println(">>반복 1");
		
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		// 반복 방법2
		System.out.println(">>반복 2");
		
		for (String item : vector) {
			 System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		// 반복 방법3
		// Iterator 를 이용한 반복
		// iterate - "반복하다", iterator - "반복자"
		// 해당 리스트 컬렉션으로부터 Iterator 객체를 가져와서 반복 할 수 있음
		
		// Iterator 메소드
		// hasNext()			: 다음 요소의 존재여부
		// next()				: 다음 요소를 반환
		// 컬렉션객체.iterator()	: 해당 컬렉션에 대한 iterator 객체를 반환
		
		System.out.println(">>반복 3");
		Iterator<String> it = vector.iterator();
		
		while(it.hasNext()) {
			String item = it.next();
			System.out.print(item);
			if(it.hasNext()) System.out.print(", "); // 뒤에 남아있는 요소가 있으면
			else System.out.println();
		}
		System.out.println("------------------------------------------------");
		System.out.println(" 삭제 전 출력");
		printList(vector); //
		// 삭제
		// - 삭제할 때, index 앞으로 한 칸씩 당겨진다
		// 	  0				1			2		  3
		// 아메리카노		청포도에이드	인크레드불		초코우유
		// 청포도에이드		인크레드불		초코우유
		// 청포도에이드		초코우유
		// 청포도에이드
		// 초코우유
		// empty (요소없음)
		vector.remove(0);
		vector.remove(1);
		vector.remove("청포도에이드");
		vector.remove("초코우유");
		
		//
		System.out.println();
		System.out.println(" 삭제 후 출력");
		printList(vector);
		
	}
}
