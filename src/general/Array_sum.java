package general;

public class Array_sum {

	public static void main(String[] args) {
		int sum=0;
		int num[]= new int[100];
		int tog=-1;
		for(int i=0; i<num.length; i++) {
			num[i]=i+1;
			tog*=-1;
			sum = sum + (num[i]*tog);
			if(num[i]%2==0) System.out.print("-");
			else if(i!=0) System.out.print("+");
			System.out.print(num[i]);
			
		}
		System.out.println("="+sum);
		
	}

}
