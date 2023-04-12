package general;

class Student1 {
	String name;
	int grade;
	int ban;
	int number;
	private String telephone;
}

public class MemberExam {
	public static void main(String[] args) {
		Student1 kim = new Student1();
		kim.name = "김현우";
		kim.grade = 2;
		// kim.telephone = "111-111"; //private으로 정의 했기 때문(: 해당 클래스 안에서만 가능)
		// System.out.println("학생의 이름은 " + kim.name + "이고, 학년은 " + kim.grade + "이고, 전화번호는 " + kim.telephone + "입니다.");
	}
}