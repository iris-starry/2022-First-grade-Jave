package general;
import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 배열 선언 및 할당
		int score[][] = new int[5][3]; 
		String article[]= {"완성도","창의성","이해도"};
		for(int i=0; i<score.length; i++) {
			System.out.printf("%d조%n",i+1);
			for(int j=0; j<score[i].length; j++) {
				System.out.print(article[j]+" : ");
				score[i][j]=sc.nextInt();
			}
			
		}
		//점수 합구하기
		int sum[]=new int[score.length];

		
		
		
		
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++){
				sum[i]+=score[i][j];
				
			}
		}
		//최대값구하기
		int max = sum[0];
		int number=0;
		
		for(int i=0; i<sum.length; i++) {
			if(sum[i]>max) {
				max=sum[i];
				number=i;
			}
		}
		//출력
		System.out.printf("최고팀 : %d번째 팀 -> 점수 : %d", number+1,max);
	}

}
