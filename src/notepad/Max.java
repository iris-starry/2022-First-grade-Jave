package notepad;

import java.util.Scanner;
public class Max{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 수 입력 : ");
		int a=scan.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int b=scan.nextInt();
		if(a>b){
			System.out.println(a+"와 "+b+"중 큰 수는"+a+"입니다.");
		}
		else{
			System.out.printf("%d와 %d 중 큰 수는 %d입니다.",a,b,b);
		}
	}
}