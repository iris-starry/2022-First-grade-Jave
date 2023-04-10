package notepad;

public class IfExam3{
	public static void main( String args[ ] ) {
		int a = args.length ;
		if( a==0 )
			System.out.println("명령행 매개변수를 입력하세요");
		else if( a== 1)
			System.out.println("입력된 명령행 매개변수는 "+args[0]+"입니다.");
		else if(a==2)
			System.out.println("입력된 명령행 매개변수는 "+args[0]+", "+ args[1]+"입니다.");
		else if(a ==3)
			System.out.println("입력된 명령행 매개변수는 "+args[0]+ ", "+args[1]+", "+args[2]+"입니다.");
		else
			System.out.println("명령행 매개변수는 3개까지만 입력 가능합니다.");
	}
}
