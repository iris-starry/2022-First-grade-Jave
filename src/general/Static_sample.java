package general;


import java.util.Scanner;

class Square1 {
	int width;
	int height;
	int idNum;
	static int Sqld = 0;
	
	public Square1(int w, int h) {
		this.width = w;
		this.height = h;
		idNum = ++Sqld;
	}

	public String print() {
		return "번호 : " + idNum + " (" + width + "," + height + ")인 사각형";
	}
	
}
public class Static_sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 길이와 세로 길이를 입력하세요.");
		Square1 sqaure = new Square1(sc.nextInt(), sc.nextInt());
		System.out.println("가로 길이와 세로 길이를 입력하세요.");
		Square1 sqaure1 = new Square1(sc.nextInt(), sc.nextInt());
		System.out.println(sqaure.print());
		System.out.println(sqaure1.print());
	}
}