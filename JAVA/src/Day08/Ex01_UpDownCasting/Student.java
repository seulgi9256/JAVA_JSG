package Day08.Ex01_UpDownCasting;

public class Student extends Person {
	
	int grade;
	String major;
	
	public Student() {
		this("이름없음", 0, 0, "없음");
	}

	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String work() {
		return "공부를 합니다.";
	}


	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}

}
