package Day13.Ex02_Comparable;

public class Student implements Comparable<Student> {
	
	String name; 	// 이름
	int age;		// 나이
	
	public Student() {
		
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
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
	public int compareTo(Student o) {
		// 학생을 이름순으로 정렬 (오름차순)
		String thisName = this.getName();		// 해당객체 이름
		String comName = o.getName();			// 비교객체 이름
		int gap = thisName.compareTo(comName);
		
		// String의 compareTo() 메소드로 문자열 크기 비교
		// 해당객체명.compareTo(비교객체명)
		// * 해당객체 > 비교객체 : 양수
		// * 해당객체 = 비교객체 : 0
		// * 해당객체 < 비교객체 : 음수
		return gap;
	}
	
	

	
	

}
