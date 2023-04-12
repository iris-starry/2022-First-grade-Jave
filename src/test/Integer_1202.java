package test;

import java.util.Scanner;
public class Integer_1202{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3�� �Է� : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("��: "+(a+b+c));
		float e;
		e = (float)(a+b+c)/3;
		System.out.printf("���: %.2f",e);
		
		
	}
}