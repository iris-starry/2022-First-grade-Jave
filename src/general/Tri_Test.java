package general;

import java.util.Scanner;

public class Tri_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가로 : ");
		int a=scan.nextInt();
		System.out.println("높이 : ");
		int b=scan.nextInt();
		Tri T1 = new Tri();
		T1.scan(a,b);
		System.out.println(T1.sam());
	}

}
class Tri{
	int width;
	int height;
	double sum;
	double sam() {
		sum=(width*height)/2;
		return sum;
	}
	void scan(int a, int b) {
		width=a;
		height=b;
	}
}
