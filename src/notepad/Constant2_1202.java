package notepad;

import java.util.Scanner;
public class Constant2_1202{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 : ");
		int r=scan.nextInt();
		final double p=3.14;
		double a=2*p*r;
		double b=p*r*r;
		System.out.println("반지름 "+r+"인 원의 둘레 : "+a);
		System.out.println("반지름 "+r+"인 원의 넓이 : "+b);
		
}
}
