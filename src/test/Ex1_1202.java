package test;

import java.util.Scanner;
public class Ex1_1202{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
			System.out.print("총 이수학점 입력 : ");
			int test=scan.nextInt();
			System.out.print("TOEIC점수 입력 : ");
			int TOEIC=scan.nextInt();
			if(test>=140){
				if(TOEIC>=700)
					System.out.print("졸업을 축하합니다.");
				else
					System.out.print("아쉽지만 수료하셨습니다.");
			}
			else
				System.out.print("졸업이 불가합니다.");
	}
}