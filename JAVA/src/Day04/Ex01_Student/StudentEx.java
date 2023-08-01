package Day04.Ex01_Student;

public class StudentEx {
	
	public static void main(String[] args) {
		// Student 객체 생성
		Student student = new Student();
		student.name = "김조은";
		student.age = 20;
		student.stdNo = "20240001";
		student.major = "영상디자인과";
				
		// Student2 객체 생성
		Student student2 = new Student("이용성", 20, "20220002", "컴퓨터공학");

		int[] score1 = {10,20,30,40,50};		// 학생1의 성적
		int[] score2 = {100,100,100,90,95};		// 학생2의 성적
		
		System.out.println("##### 학생1 #####");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		System.out.println("학생1 - 유튜브 편집 실습");		
		student.study("유튜브 편집 실습");
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10, 20));
		System.out.println("학생1 - 기말고사 점수 : " + student.getAverage(30, 40, 50));
		System.out.println("학생1 - 최종 점수 : " + student.getAverage(score1));
		
		System.out.println();
		
		System.out.println("##### 학생2 #####");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println("학생2 - 전공 : " + student2.major);
		System.out.println("학생2 - 플러터 공부하기");		
		student.study("플러터");
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(100, 100));
		System.out.println("학생2 - 기말고사 점수 : " + student2.getAverage(100, 90, 95));
		System.out.println("학생2 - 최종 점수 : " + student2.getAverage(score2));
		
	}

}
