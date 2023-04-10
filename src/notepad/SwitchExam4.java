package notepad;

public class SwitchExam4{
	public static void main( String args[] ){
		int a = Integer.parseInt( args[0] ); //인트로 바꾸기
		int day;
		switch( a ) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
				day = 31; break;
			case 4 : case 6 : case 9 : case 11 :
				day = 30; break;
			default : day = 28;
		}
		System.out.println(a +"월은"+day + "일입니다.");
	}
}
