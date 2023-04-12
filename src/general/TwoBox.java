package general;

public class TwoBox {
	public static void main(String[] args) {
		Box1 box1 = new Box1(3, 7, 5);
		Box1 box2 = new Box1(4, 6, 3);
		Box1 box3 = new Box1();
		
		System.out.println(box1.print() + box1.calc_vol());
		System.out.println(box2.print() + box2.calc_vol());
		System.out.println(box3.print() + box3.calc_vol());
	}
}

class Box1 {
	int width;
	int height;
	int depth;
	//전역 : 처음 ~ 끝 생존력 > 지역 : 중괄호 생존력
	static int cnt;
	
	//생성자
	// 1. 클래스 이름과 동일
	// 2. 리턴형 없음
	// 3. 오버로딩
	
	Box1() { cnt++; System.out.println("객체 " + cnt + "생성"); }
	Box1 (int w, int h, int d) {
		this.width = w;
		this.height = h;
		this.depth = d;
		cnt++; System.out.println("객체 " + cnt + "생성");
	}
	
	int calc_vol() { return this.width * this.height * this.depth; }

	String print() { return "(" + this.width + ", " + this.height + ", " + this.depth + ")의 부피 : "; }
} 