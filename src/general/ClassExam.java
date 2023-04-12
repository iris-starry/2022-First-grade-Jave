package general;

public class ClassExam {

	public static void main(String[] args) {
		Student Kim = new Student();
		Student Kim2= new Student();
		Kim.st1("김현우",2);
		Kim2.st1("홍길동",1);
		Kim.print();
		Kim2.print();
	}

}
class Student{
	String name;
	int grade;
	int ban;
	int number;
	String telephone;
	void st1(String a, int b){
		name = a;
		number = b;
	}
	void print() {
		System.out.println(name+" "+number);
	}
}
 