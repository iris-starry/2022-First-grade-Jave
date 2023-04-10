package notepad;

public class Switch_Class {
	public static void main(String args[]){
		int num=1;
		switch (num){
			case 1 :
			case 2 :
				System.out.println("뉴미디어소프트웨어과");
				break;
			case 3 :
			case 4 :
				System.out.println("뉴미디어웹솔루션과");
				break;
			case 5 :
			case 6 :
				System.out.println("뉴미디어디자인과");
				break;
			default :
				System.out.println("잘못 입력하셨습니다");
				break;
		}
	}
}
