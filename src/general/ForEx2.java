package general;

public class ForEx2 {

	public static void main(String[] args) {
		int num[]= new int[100];
		int sum=0;
		for(int i=0; i<num.length; i++) {
			num[i]=i+1;
			sum+=num[i];
			if(num[i]!=100) System.out.print(num[i]+" + ");
			else System.out.print(num[i]);
		}
		System.out.println(" ="+sum);
	}

}
