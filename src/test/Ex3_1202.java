package test;

import java.util.Scanner;
public class Ex3_1202{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("�л� �� �Է� : ");
		int s=scan.nextInt();
		int test90=0;
		int test80=0;
		int test70=0;
		int test60=0;
		int test=0;
		for( int i=1 ; i<=s ; i++){
			System.out.print(i+"�� ���� �Է� : ");
			int s1=scan.nextInt();
			if(s1>=90)
				test90+=1;
			else if(s1>=80)
				test80+=1;
			else if(s1>=70)
				test70+=1;
			else if(s1>=60)
				test60+=1;
			else
				test+=1;
				
		}
		System.out.println("90�� �̻� : "+test90);
		System.out.println("80�� �̻� : "+test80);
		System.out.println("70�� �̻� : "+test70);
		System.out.println("60�� �̻� : "+test60);
		System.out.println("60�� �̸� : "+test);
	}
}