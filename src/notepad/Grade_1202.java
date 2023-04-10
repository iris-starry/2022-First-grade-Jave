package notepad;

import java.util.Scanner;
public class Grade_1202{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("--------자바실행--------");
		System.out.println(" 이름  과제  보너스  합계 ");

		System.out.println("1.이름 과제 보너스");
		String name=sc.nextLine();
		int tast=sc.nextInt();
		int bonus=sc.nextInt();
		int a= tast+bonus;
		System.out.printf("%d\n",name,tast,+bonus,a);

		System.out.println("2.이름 과제 보너스");
		name=sc.nextLine();
		tast=sc.nextInt();
		bonus=sc.nextInt();
		a= tast+bonus;
		System.out.println(name+"\t"+tast+"\t"+bonus+"\t"+a);

		System.out.println("3.이름 과제 보너스");
		name=sc.nextLine();
		tast=sc.nextInt();
		bonus=sc.nextInt();
		a= tast+bonus;
		System.out.println(name+"\t"+tast+"\t"+bonus+"\t"+a);
		
		
		
		
	}
}			
