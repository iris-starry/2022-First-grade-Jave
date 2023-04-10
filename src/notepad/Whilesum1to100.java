package notepad;

public class Whilesum1to100{
	public static void main( String args[] ){
		int num = 1, sum = 0;
		do{
			sum+=num;
			num++;
		}while(num<=100);
		System.out.println(sum);
	}
}
