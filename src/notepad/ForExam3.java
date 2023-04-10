package notepad;

public class ForExam3{	
	public static void main(String args[ ]){
		int sum=0;
		System.out.print("1-2+3-4+5-6+7-8+9-10=");
		for( int i =1; i<=10; i++)
			if(i%2==0) sum-=i;
			else sum+=i;
		System.out.print(sum);
	}
}
