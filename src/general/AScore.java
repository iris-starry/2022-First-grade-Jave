package general;

import java.util.Scanner;
public class AScore{
	public static void main(String args[]){
		//점수입력 메서드
		Scanner sc=new Scanner(System.in);
		System.out.println("몇 과목을 입력하시겠습니다?");
		int count=sc.nextInt();
		int[] score=new int[count];
		for(int i=0; i<score.length; i++)
	      	score[i]=keyInput();
		
		
		//합계,평균,성취도 계산 메서드
		getResult1(score);
		int min_idx = getResult2(score);
		System.out.println("== 노력이 가장 필요한 교과 ==");
		System.out.print("과목 : "+(min_idx+1)+" 번째 과목");
		System.out.print(" 점수 : "+score[min_idx]);
	}
	static int keyInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		return sc.nextInt();
	}
	static void getResult1(int[] s){
		int sum=0;
		for(int i=0; i<s.length; i++)
			sum+=s[i];
		int avg=sum/s.length;
		char res;
		switch(avg/10){
			case 10:
			case 9: res='A'; break;
			case 8: res='B'; break;
			case 7: res='C'; break;
			default: res='D'; break;
		}
		System.out.println("== 입력 처리 결과 ==");
		System.out.println("합계 : "+sum+"\t평균 : "+avg);
		System.out.println("성취도 : "+res);
	}
	static int getResult2(int[] s){
		int min=s[0]; 
		int idx=0;
		for(int i=1; i<s.length; i++)
			if(s[i]<min) {
				idx=i;
				min = s[i];
			}
		return idx;
	}
}
