package test;

import java.util.Scanner;
public class Currency_1202{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int won = scan.nextInt();
		System.out.printf("�������� %d��\n",won/50000);
		won = won%50000;
		System.out.printf("������ %d��\n",won/10000);
		won = won%10000;
		System.out.printf("��õ���� %d��\n",won/5000);
		won = won%5000;
		System.out.printf("õ���� %d��\n",won/1000);
		won = won%1000;
		System.out.printf("����� %d��\n",won/500);
		won = won%500;
		System.out.printf("��� %d��\n",won/100);
		won = won%100;
		System.out.printf("���ʿ� %d\n",won/50);
		won = won%50;
		System.out.printf("�ʿ� %d\n",won/10);
		won = won%10;
		System.out.printf("���� %d\n",won/5);
		won = won%5;
		System.out.printf("�Ͽ� %d\n",won/1);
		
	}
}