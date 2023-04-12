package test;

import java.util.Scanner;
public class Group_1202{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);	
		System.out.print("�����Է�: ");
		int a= scan.nextInt();
		if(a>0){
			System.out.println("plus");	
		}
		else{
			System.out.println("minus");
		}
		if(a%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
}