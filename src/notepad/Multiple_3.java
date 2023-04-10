package notepad;

import java.util.Scanner;
public class Multiple_3{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a=scan.nextInt();
		if(a%3==0){
			System.out.println(a+"은(는) 3의 배수입니다.");
		}
		
	}
}
