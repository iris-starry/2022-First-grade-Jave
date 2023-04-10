package notepad;

import java.util.Scanner;
public class CondOp_Test{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a=scan.nextInt();
		String b= (a%2==0)? "짝수" : "홀수";
		System.out.println(a+"은(는)"+b+"입니다.");
		
	}
}
