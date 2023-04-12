package test_2;


import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num[] = new int[10];
		int bic=0;
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+"번째 수 : ");
			num[i]=sc.nextInt();
		}
		
		bic=num[0];
		for(int i=0; i<num.length; i++) {
			if(bic<num[i]) {
				bic=num[i];
			}
		}
		
		System.out.println("가장 큰 수 : "+bic);
	}

}
