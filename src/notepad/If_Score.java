package notepad;

public class If_Score {
	public static void main(String args[]){
		int score =85;
		if(score==100){
			System.out.println("만점입니다");
		}
		if(score>=90){
			System.out.println("A입니다.");
		}
		else if (score>=80){
			System.out.println("B입니다.");
		}
		else if (score>=70){
			System.out.println("C입니다.");
		}
		else {
			System.out.println("D입니다.");
		}
	}
}
