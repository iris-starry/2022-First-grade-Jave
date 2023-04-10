package notepad;

import java.util.Scanner;
public class Consstant1_1202{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("시험점수 : ");
		int test=sc.nextInt();
		final int a=85;
		int b=test-a;
		System.out.println(test+"-"+a+"="+b);
 }
}
