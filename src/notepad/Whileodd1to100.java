package notepad;

public class Whileodd1to100{
	public static void main( String args[] ){
		int num = 1;
		do{
			if(num%2!=0)
				System.out.println(num);
			num++;
		}while(num<=100);
	}
}
