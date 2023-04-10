package notepad;

import java.util.Scanner;
public class WhileExam2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("몇번 : ");
		int num=scan.nextInt();
		int sum=0, i=1;
		while(i<=num){
			if( i%2 == 0){
				sum-=i;
				System.out.print("-"+i);
			}
			else {
				sum+= i;
				if(i==1)System.out.print(1);
				else System.out.print("+"+i);
			}
			i++;
		}
		System.out.print("="+sum);
	} 
}
