package notepad;

import java.util.Scanner;
public class IfExam2_1{
	public static void main(String args[ ]){
		Scanner scan = new Scanner(System.in);		
		int a = scan.nextInt();
		char b = scan.next().charAt(0);
		int c = scan.nextInt();
		if( b == '+' ) System.out.println(a+" " +b+" "+c+" = "+(a+c) );
		else if( b == '-' ) System.out.println(a+" "+b+" "+c+" = "+(a-c));
		else if( b == '*' ) System.out.println(a +" " +b+" "+c+" = "+(a*c));
		else if( b == '/' ) System.out.println(a+" "+b+" "+c+" = "+(a/c));
		else System.out.println("사칙연산자가 아닙니다.");
}
}
