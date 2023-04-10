package notepad;

import java.util.Scanner;
public class FlagSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력하시오 : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1 ; i<=n ; i++){
			if(i%2==0){
				System.out.print(-i);
				sum-=i;
			}
			else{
				if(i==1) System.out.print(i);
				else System.out.print("+" + i);
				sum+=i;
			}
		}
		System.out.printf("="+sum);
	}
}
