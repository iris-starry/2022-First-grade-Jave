package general;

class Student2 {
	static String school = "hangang";
	String name;
	int grade;
}

public class StudentTest {
	public static void main(String[] args) {
		System.out.println(Student2.school);
		// System.out.println(kim.school); //객체를 만든 후 사용
		Student2 kim = new Student2();
		System.out.println(kim.school);
		Student2 jang = new Student2();
		Student2 bak = new Student2();
		
	}
}

