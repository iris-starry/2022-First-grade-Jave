package notepad;

import java.util.Scanner;
public class SwitchOp{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");
		int a=scan.nextInt();
		char b=scan.next().charAt(0);
		int c=scan.nextInt();
		switch(b){
			case '+' : System.out.println(a + "+" +c+"="+(a+c));
				break;
			case '-' : System.out.println(a + "-" +c+"="+(a-c));
				break;
			case '*' : System.out.println(a + "*" +c+"="+(a*c));
				break;
			case '/' : System.out.println(a + "/" +c+"="+(a/c));
				break;
			default : System.out.println("사칙연산자가 아닙니다.");
		
		}
	}
}
