package test;

import java.util.Scanner;
public class Ex1_1202{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
			System.out.print("�� �̼����� �Է� : ");
			int test=scan.nextInt();
			System.out.print("TOEIC���� �Է� : ");
			int TOEIC=scan.nextInt();
			if(test>=140){
				if(TOEIC>=700)
					System.out.print("������ �����մϴ�.");
				else
					System.out.print("�ƽ����� �����ϼ̽��ϴ�.");
			}
			else
				System.out.print("������ �Ұ��մϴ�.");
	}
}