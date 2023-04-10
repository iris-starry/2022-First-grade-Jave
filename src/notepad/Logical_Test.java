package notepad;

public class Logical_Test{
	public static void main(String args[ ]){
		int a=10;
		System.out.println((a=20)==20);
		//System.out.println(!a);
		System.out.println(a);
		
		boolean power=false;
		System.out.println(power);
		System.out.println(!power);
		power= !power;
		System.out.println(!power);
		
		int c=10;
		System.out.println((1>2) & (1<(c=20)));
		System.out.println(c);
		System.out.println((1>2) && (1<(c=20)));
		System.out.println(c);
		System.out.println((1<2) | (1>2));
		System.out.println((1<2) || (1>2));
		System.out.println(!(1<2));

	}
}
