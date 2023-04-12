package general;

import java.util.Scanner;

public class Array_sort{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int tmp=0;
		int score[]= new int[10];
		for(int i=0; i<score.length; i++) {
			do {
				System.out.print((i+1)+"번 데이터 : ");
				score[i]=scan.nextInt();
			}while(score[i]<0 || score[i]>100);
		}
		for(int i=0; i<score.length; i++)
			System.out.print(score[i]+" ");
		System.out.println();
		for(int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[i]>score[j]) {
					tmp=score[i];
					score[i]=score[j];
					score[j]=tmp;
				}
			}
			System.out.print(score[i]+" ");
		}
		
	}
}
