package notepad;

public class EvenSum1to100{	
	public static void main(String args[ ]){
		int sum=0;
		for(int a=1;a<=100;a++)
			if(a%2==0) sum+=a;
		System.out.println(sum);
	}
}