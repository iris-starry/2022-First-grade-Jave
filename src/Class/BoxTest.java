package Class;

class Box
{
	int width;
	int height;
	int depth;
	public Box(int width, int height, int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	//부피 메서스
	public void volume() {
		int volume;
		volume = width * height * depth;
		System.out.println("부피 :"+volume);
	}
}
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(5, 3, 7);
		Box box2 = new Box(1, 2, 3);
		box1.volume();
		box2.volume();
		
	}

}

