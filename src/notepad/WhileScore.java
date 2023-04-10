package notepad;

import java.util.Scanner;
public class WhileScore{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double sum = 0, num=0;
		do{
			System.out.print("숫자 입력 : ");
			double score = scan.nextDouble();
			if(score==0) break;
			sum+=score;
			num+=1;
		}while(true);
		System.out.println("점수의 합은 "+sum+" 평균은 "+sum/num+" 입니다 ");
	}
}