package notepad;

import java.util.Scanner;
public class If_Elseif_Else_Test{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("가지고 있는 돈: ");
		int a=scan.nextInt(  );
		if(a>= 30000){
			if(a>=50000){
				System.out.println("모범택시");
			}
			else{
				System.out.println("일반택시");
			}
		}
		else if(a>=10000){
			System.out.println("버스");
		}
		else{
			System.out.println("걸어감");
		} 

	}
}
