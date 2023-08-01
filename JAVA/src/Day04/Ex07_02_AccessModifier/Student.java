package Day04.Ex07_02_AccessModifier;

import Day04.Ex07_01_AccessModifier.Person;

public class Student extends Person{
	
	//생성자
	public Student() {
		super();
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}

	public void defaultSetting() {
		name = "이름없음";
		height = 160; // 같은 패키지, 다른 패키지라면 자식 패키지인 경우
		//age = 20; // default 라서 같은 패키지에서만 접근 가능
		//weight = 40; // private 이라서 해당 클래스에서만 접근 가능
		setAge(20);
		setWeight(40);
	}
	

}
