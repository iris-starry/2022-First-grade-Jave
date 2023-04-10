package notepad;

import java.util.Scanner;
public class Absolute_Test{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a=scan.nextInt();
		int b= (a>0)? a : a*(-1);
		System.out.println(a+"의 절대값은 "+b+"입니다.");
	}
}