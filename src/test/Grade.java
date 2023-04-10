package test;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num= new int[3][2];
		double sum=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print((i+1)+"학년 "+(j+1)+"학기 점수 입력 : " );
				num[i][j]=sc.nextInt();
				sum+=num[i][j];
			}
		}
		System.out.printf("3년간 의 평균 : %.2f",sum/6);
	}

}

