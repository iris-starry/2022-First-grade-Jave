package notepad;

public class Method_Test {
	public static void main(String args[]){
		System.out.println(Sum_Range(1,10));
		System.out.println(Sum_Range(5,9));
		
	}
	static int Sum_Range(int dat1, int dat2){
		int sum=0;
		for(int i=dat1; i<=dat2;i++)
			sum+=i;
		System.out.print(dat1+"부터"+dat2+"까지의 합 ");
		return sum;
	}
}
