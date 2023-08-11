package Day13.Ex03_Comparator;

import java.util.Comparator;

public class User implements Comparator<User>{
	
	String id;
	String name;
	int age;
	
	public User() {
		
	}
	
	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		// 정렬 기준 1 : 나이순 - 오름차순
		int Com1Age = o1.getAge();
		int Com2Age = o2.getAge();
		
		//정렬 기준 2 : 이름순 - 오름차순
		String Com1Name = o1.getName();
		String Com2Name = o2.getName();
		
		int result1 = Com1Age - Com2Age;
		int result2 = Com1Name.compareTo(Com2Name);
		
		return result1 == 0 ? result2 : result1;
		
//		if(	Com1Age > Com2Age) {
//			return 1;
//		}
//		
//		if (Com1Age == Com2Age) {
//			if(gap>0) return 1;
//			if(gap==0 ) return 0;
//			if(gap<0) return -1;
//		return 0; // -> 중간에 if문 없이 return gap;으로 해도됨
//		}
//		
//		if (Com1Age < Com2Age) {
//			return -1;
//		}
//		
//		return 0;
		
		
//		(방법3)
//		if(	Com1Age > Com2Age) {
//		return 1;
//	}
//	
//	if (Com1Age == Com2Age) {
		// 해당문자열.compareTo(비교문자열)		- String 클래스의 compareTo()
		// - 해당문자열 > 비교문자열 : "해당문자열이 사전순으로 비교문자열보다 더 뒤에 있는 경우" -> 양수
		// - 해당문자열 = 비교문자열 : "해당문자열이 비교문자열과 사전순으로 같은 위치에 있는 경우" -> 0
		// - 해당문자열 < 비교문자열 : "해당문자열이 사전순으로 비교문자열보다 더 앞에 이씨는 경우" -> 음수
		
		// gap = Com1Name.compareTo(Com2Name);
		
		//	return 0;
//	}
//	
//	if (Com1Age < Com2Age) {
//		return -1;
//	}
//	
//	return 0;
	}
}
