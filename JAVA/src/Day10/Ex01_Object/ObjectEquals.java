package Day10.Ex01_Object;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
}

public class ObjectEquals {
	public static void main(String[] args) {
		Student student = new Student(1001, "김조은");
		Student student2 = student;
		Student student3 = new Student(1001, "김조은");
		
		if( student == student2 )
			System.out.println("student 와 student2 의 주소가 같습니다.");
		else
			System.out.println("student 와 student2 의 주소가 다릅니다.");	
		
		if( student.equals(student2) )
			System.out.println("student 와 student2는 같습니다.");
		else
			System.out.println("student 와 student2는 다릅니다.");
		
		// ---------------------
		if( student == student3 )
			System.out.println("student 와 student3 의 주소가 같습니다.");
		else
			System.out.println("student 와 student3 의 주소가 다릅니다.");	
		
		if( student.equals(student3) )
			System.out.println("student 와 student3는 같습니다.");
		else
			System.out.println("student 와 student3는 다릅니다.");	
		
	}
}
