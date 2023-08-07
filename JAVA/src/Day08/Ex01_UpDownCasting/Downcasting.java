package Day08.Ex01_UpDownCasting;

public class Downcasting {
	
	public static void main(String[] args) {
		// 다운 캐스팅 (강제 형 변환)
		// : 전제 조건 - 업캐스팅
		//   다운 캐스팅은 업캐스팅된 부모 객체를 자식 객체로 변환하는 것
		// - 업캐스팅			: (부모) <-> (자식)
		// - 다운캐스팅			: (자식) <-> (부모)
		
		// 업캐스팅
		Person person = new Student("김조은", 20, 1, "신재생에너지과");
		
		System.out.println( person ); // Student [grade=1, major=신재생에너지과]
		System.out.println( person.work() ); // 공부를 합니다.
		
		// 다운캐스팅
		Student student = (Student) person;
		
		System.out.println( person ); // Student [grade=1, major=신재생에너지과]
		System.out.println( person.work() ); // 공부를 합니다.
		
		System.out.println("grade : " + student.grade); // 다운캐스팅 때문에 변수 접근 가능
		System.out.println("major : " + student.major); // 다운캐스팅 때문에 변수 접근 가능


	}

}
