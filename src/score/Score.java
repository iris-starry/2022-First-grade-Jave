package score;

import java.util.Scanner;

public class Score {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 학생을 입력하시겠습니까 : ");
		int stu_num = sc.nextInt();
		System.out.print("몇 과목을 입력하시겠습니까 : ");
		int sub = sc.nextInt();

		Student_Score[] stu = new Student_Score[stu_num];
		for(int i = 0; i < stu_num; i++) stu[i] = new Student_Score(sub);

		String[] sub_name = {"국어", "영어", "수학", "자바", "C", "과학", "사회", "기가", "한국사", "일본어"};
		//입력
		for(int i = 0; i < stu_num; i++) stu[i].input(i, sub_name);
		//계산
		for(int i = 0; i < stu_num; i++) stu[i].calc();
		//순위계산
		for(int i = 0; i < stu_num; i++) stu[i].ranking(stu);

		System.out.println("1. 학번순\t2. 석차순");
		System.out.print("출력형식 선택 : ");
		int menu = sc.nextInt();
		do {
			switch (menu) {
			case 1: //학번순
				Student_Score.order_number(stu);
				break;
			case 2: //석차순
				Student_Score.order_rank(stu);
				break;
			default:
				System.out.println("다시 입력 : ");
				menu = sc.nextInt();
			}
		} while(menu != 1 && menu != 2);
		
		//subtitle 출력
		System.out.printf(" %2s %6s  ", "학번", "이름");
		for(int j = 0; j < sub; j++)
			System.out.printf("%7s", sub_name[j]);
		System.out.printf("%7s %9s %4s %4s\n","합계", "평균", "평점", "석차");

		//출력
		for(int i = 0; i < stu_num; i++) stu[i].print();
	}
}