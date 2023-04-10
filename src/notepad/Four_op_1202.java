package notepad;

import java.util.Scanner;
public class Four_op_1202{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 실수 입력");
		double a=sc.nextDouble();
		System.out.print("두번 째 실수 입력");
		double b=sc.nextDouble();
		System.out.println(a + " + "+ b + "=" + (a+b));
		System.out.println(a + " - " + b +"=" + (a-b));
		System.out.println(a + " * " + b +"=" + (a*b));
		System.out.println(a + " / " + b +"=" + (a/b));
		
 }
}
