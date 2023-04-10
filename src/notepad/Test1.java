package notepad;

import java.util.Scanner;
public class Test1{
	public static void main(String args[]){
		//점수입력 메서드
		int[ ] Score=new int[3];
		for(int i=0; i<Score.length; i++)
	      	      Score[i]=keyInput();
		
		
		//합계,평균,성취도 계산 메서드
		getResult1(Score[0],Score[1],Score[2]);
		int min_idx = getResult2(Score[0],Score[1],Score[2]);

		System.out.println("== 노력이 가장 필요한 교과 ==");
		System.out.print("과목 : "+min_idx+1+"번째 과목");
		System.out.print(" 점수 : "+Score[min_idx]);
	}
	static int keyInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		return sc.nextInt();
	}
	static void getResult1(int a,int b, int c){
		int sum= a+b+c;
		int avg=sum/3;
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
	static int getResult2(int a,int b, int c){
		int num=0; 
		if(a<b && a<c){
			num=0; 
		}
		else if(b<c){
			num=1; 
		}
		else if(c<a){
			num=2; 
		}
		return num;
	}
}