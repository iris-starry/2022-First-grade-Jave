package general;


import java.util.Scanner;

public class sort {
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
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length-i; j++) {
				if(a[i]>a[j]) {
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
			System.out.println(a[i]);
		}
		
	}
}
