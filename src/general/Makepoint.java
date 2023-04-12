package general;

import java.util.Scanner;

class Point{
	int no;
	double x,y;
	static int cnt;
	Point(double x, double y) {
		this.x=x;
		this.y=y;
		no=++cnt;
		printPoint();
	}
	void printPoint(){
		System.out.println(this.no+"점의 좌표 : ("+this.x+", "+this.y+")");
	}
	void move(double x, double y){
		this.x+=x;
		this.y+=y;
		System.out.print("이동한 ");
		printPoint();
	}
}
public class Makepoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point[] p=new Point[3];
		for(int i=0; i<p.length; i++) {
			System.out.println((i+1)+"번째 점의 좌쵸를 입력하세요. ==> x y");
			p[i] = new Point(sc.nextDouble(), sc.nextDouble());
		}
		
		
		System.out.print("이동할 점을 선택하세요.");
		int sel_p=sc.nextInt();
		System.out.println("이동할 거리를 입력하세요. ==> x y");
		p[sel_p-1].move(sc.nextDouble(),sc.nextDouble());
		

	}

}
