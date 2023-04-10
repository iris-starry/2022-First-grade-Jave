package notepad;

import java.util.Scanner;
public class Tax_calculate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("연간 근로소득 : ");
		int salary = sc.nextInt();
		System.out.print("소득세는 ");
		if(salary<=20000000) System.out.printf("%d이다.",(int)(salary*0.05));
		else if(salary<=40000000) System.out.printf("%d이다.",(int)(salary*0.15));
		else if(salary<=80000000) System.out.printf("%d이다.",(int)(salary*0.25));
		else if(salary>80000000) System.out.printf("%d이다.",(int)(salary*0.40));
	}
}
