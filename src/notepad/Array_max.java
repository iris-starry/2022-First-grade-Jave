package notepad;

import java.util.Scanner;

public class Array_max {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int score[] = new int[10];
		for(int i=0; i< score.length; i++){
			System.out.print("점수를 입력해주십시오 > ");
			score[i] = scan.nextInt();
		}
		int max=score[0];
		for(int l=0; l<score.length; l++)
			if(max<score[l]) max = score[l];
		System.out.print(score.length+ "명의 학생중에 최고점수는 "+max);
	}
}
