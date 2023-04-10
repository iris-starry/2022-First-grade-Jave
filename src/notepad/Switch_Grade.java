package notepad;

public class Switch_Grade {
	public static void main(String args[]){
		char grade='C';
		switch (grade){
			case 'A' :
			case 'B' :
				System.out.println("잘했습니다.");
				break;
			case 'C' :
			case 'D' :
				System.out.println("좀 더 노력하세요.");
				break;
			case 'F' :
				System.out.println("다시 수강하세요.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다");
				break;
		}
	}
}
