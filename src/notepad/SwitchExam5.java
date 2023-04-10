package notepad;

import java.util.Scanner;
public class SwitchExam5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int a = sc.nextInt();
		switch( a ){
			case 1 : case 2:
				System.out.print("   =>   뉴미디어소프트웨어과"); break;
			case 3 : case 4 :
				System.out.print("   =>   뉴미디어웹솔루션과"); break;
			case 5 : case 6 :
				System.out.print("   =>   뉴미디어디자인과"); break;
		}
	}
}

