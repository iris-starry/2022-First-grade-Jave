package score;

import java.util.Scanner;

public class Student_Score {
	String name_Num;
	String name;
	int[] score;
	double avg;
	char result;
	int rank = 1;
	
	Student_Score(int subcnt) {
		this.score = new int[subcnt + 1];
	}
	
	void print() {
		System.out.printf("%4s %6s ", name_Num, name);
		for(int j = 0; j < score.length; j++)
			System.out.printf("%7d ", score[j]);
		System.out.printf(" %9.2f %4c %4d\n", avg, result, rank);
	}
	
	void input(int i, String[] sub_name) {
		Scanner sc = new Scanner(System.in);
		System.out.println((i+1) + "번째 학생 입력");
		System.out.print("학번 : ");
		name_Num = sc.next();
		System.out.print("이름 : ");
		name = sc.next();

		for(int j = 0; j < score.length - 1; j++) {
			do {
				System.out.print(sub_name[j] + " : ");
				score[j] = sc.nextInt();
			} while(score[j] < 0 || score[j] > 100);
		}
	}
	
	void calc() {
		int sub = score.length - 1;
		for(int j = 0; j < sub; j++) score[sub] += score[j];
		
		avg = (double)score[sub] / sub;

		switch((int)avg / 10) {
		case 10 : case 9 : 
			result ='A'; 
			break;
		case 8 : 
			result ='B';
			break;
		case 7 : 
			result ='C';
			break;
		case 6 :
			result ='D';
			break;
		default : 
			result ='E';
		}
	}
	
	void ranking(Student_Score[] stu) {
		for(int j = 0; j < stu.length; j++)
			if(score[score.length - 1] < stu[j].score[score.length - 1]) rank++;
	}
	
	static void order_number(Student_Score[] stu) {
		for(int i = 0; i < stu.length - 1; i++)
			for(int j = i + 1; j < stu.length; j++)
				if(stu[i].name_Num.compareTo(stu[j].name_Num) > 0) {
					Student_Score temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
	}
	
	static void order_rank(Student_Score[] stu) {
		for(int i = 0; i < stu.length - 1; i++)
			for(int j = i + 1; j < stu.length; j++)
				if(stu[i].rank > stu[j].rank) {
					Student_Score temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
	}
}
