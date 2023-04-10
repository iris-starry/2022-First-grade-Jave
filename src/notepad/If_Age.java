package notepad;

import java.util.Scanner;
public class If_Age{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>=60 && score<100 ){
			System.out.println("노인입니다.");
		}
		else if (score>=20 ){
			System.out.println("청년입니다.");
		}
		else if (score>=10 ){
			System.out.println("학생입니다.");
		}
		else if (score>=0 ){
			System.out.println("아이입니다.");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
