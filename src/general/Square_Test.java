package general;

import java.util.Scanner;

public class Square_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가로 : ");
		int a=scan.nextInt();
		System.out.println("세로 : ");
		int b=scan.nextInt();
		Square S1 = new Square();
		S1.scan(a,b);
		
		System.out.println("넓이: "+S1.num1());
		System.out.println("길이: "+S1.num2());
	}

}
class Square{
	int width;
	int height;
	void scan(int a, int b) {
		width=a;
		height=b;
	}
	int num1() {
		int sum=width*height;
		return sum;
	}
	int num2() {
		int round=(width+height)*2;
		return round;
	}
	
}
