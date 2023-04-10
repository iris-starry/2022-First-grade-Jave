package notepad;

import java.util.Scanner;
public class MinOfThree{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.print("첫 번째 수 입력 : ");
	int a=scan.nextInt();
	System.out.print("두 번째 수 입력 : ");
	int b=scan.nextInt();
	System.out.print("세 번째 수 입력 : ");
	int c=scan.nextInt();
	if(a<b){
		if(a<c) System.out.printf("%d와 %d와 %d 중 제일 작은 수는 %d입니다.",a,b,c,a);
	}
	if(b<a){
		if(b<c) System.out.printf("%d와 %d와 %d 중 제일 작은 수는 %d입니다.",a,b,c,b);
	}
	if(c<a){
		if(c<b) System.out.printf("%d와 %d와 %d 중 제일 작은 수는 %d입니다.",a,b,c,c);
	}

	/*if(a<b&a<c) System.out.printf("%d와 %d와 %d 중 제일 작은 수는 %d입니다.",a,b,c,a);
	if(b<a&b<c) System.out.printf("%d와 %d와 %d 중 제일 작은 수는 %d입니다.",a,b,c,b);
	if(c<a&c<b) System.out.printf("%d와 %d와 %d 중 제일 작은 수는 %d입니다.",a,b,c,c);*/
	}
}
