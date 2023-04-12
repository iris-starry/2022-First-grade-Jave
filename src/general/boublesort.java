package general;

import java.util.Scanner;

public class boublesort {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int tmp=0;
		System.out.println("몇개의 데이터를 입력하시겠습니까?");
		int data=scan.nextInt();
		int a[]= new int[data];
		
		for(int i=0; i<data; i++) {
			System.out.print((i+1)+"번 데이터 : ");
			a[i]=scan.nextInt();
		}
		
		for(int i=a.length; i>=0; i--) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
					tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
