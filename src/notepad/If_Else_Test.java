package notepad;

import java.util.Scanner;
public class If_Else_Test{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score =scan.nextInt();
		if( score>=80){
			System.out.println("합격입니다.");
		}
		else{
			System.out.println("불합격입니다.");
		}

	}
}
