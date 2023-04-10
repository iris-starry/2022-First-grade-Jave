package Class;

public class StaticVariExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();	
		System.out.println("생성된 학생 객체 수는 "+ Student.count+"입니다.");
		Student jang = new Student();
		System.out.println("생성된 학생 객체 수는 "+ Student.count+"입니다.");
		Student bak = new Student();
		System.out.println("생성된 학생 객체 수는 "+ Student.count+"입니다.");
		Student min = new Student();
		System.out.println("생성된 학생 객체 수는 "+ Student.count+"입니다.");
	}

}
class Student{
	String name;
	int grade;
	static int count = 0;
	public Student() {
		count++;
	}
}
