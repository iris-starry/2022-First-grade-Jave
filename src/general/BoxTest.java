package general;

class Box
{
	int width;
	int height;
	int depth;
	public void Box(int width, int height, int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	//부피 메서스
	public void volume(int width, int height, int depth) {
		int volume;
		volume = width * height * depth;
		System.out.println("부피 :"+volume);
	}
}
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1= new Box();
		box1.volume(5, 3, 7);
		System.out.println("");
	}

}
