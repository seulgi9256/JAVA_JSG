package Day13.Ex02_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	
	public static void main(String[] args) {
		
	
	ArrayList<Student> studentList = new ArrayList<>();
	
	Student s1 = new Student("김조은", 20);
	Student s2 = new Student("이조은", 22);
	Student s3 = new Student("나조은", 24);
	Student s4 = new Student("황조은", 24);
	Student s5 = new Student("정조은", 26);
	Student s6 = new Student("박조은", 26);
	Student s7 = new Student("윤조은", 26);
	Student s8 = new Student("구조은", 28);
	Student s9 = new Student("김부평", 30);
	Student s10 = new Student("안조은", 32);
	
	studentList.add(s1);
	studentList.add(s2);
	studentList.add(s3);
	studentList.add(s4);
	studentList.add(s5);
	studentList.add(s6);
	studentList.add(s7);
	studentList.add(s8);
	studentList.add(s9);
	studentList.add(s10);
	
	// 이름순
	Collections.sort(studentList);
	
	for(Student student : studentList) {
		System.out.println(student.name + " : " + student.age);
	}
	
	}

}
