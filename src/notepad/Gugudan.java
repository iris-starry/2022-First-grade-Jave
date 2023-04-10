package notepad;

import java.util.Scanner;
public class Gugudan{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("시작단 : ");
		int start=scan.nextInt();
		System.out.print("마지막 단 : ");
		int finish=scan.nextInt();
		if(finish>start){
			for(  ; start<=finish ; start++){
				for(int j=1; j<=9; j++)
					System.out.println(start+"*"+j+"="+(start*j));
				System.out.println("-------------");
			}
		}	
		else{
			for(  ; finish<=start ; finish++){
				for(int j=1; j<=9; j++)
					System.out.println(finish+"*"+j+"="+(finish*j));
				System.out.println("-------------");
			}
		}
	}
}
