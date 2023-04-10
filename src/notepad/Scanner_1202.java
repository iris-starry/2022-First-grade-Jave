package notepad;

import java.util.Scanner;
public class Scanner_1202{
	public static void main(String args[ ]){
	Scanner scan = new Scanner(System.in);
	System.out.print("사각형의 밑면 : ");
	int a = scan.nextInt();
	System.out.print("사각형의 높이 : ");
	int b = scan.nextInt();
	int c = a*b;
	System.out.print("사각형의 넓이 : ");
	System.out.print(c);
}
}