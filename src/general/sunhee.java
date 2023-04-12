package general;

import java.util.Scanner;
//학번,이름,

public class sunhee {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String subj_name[]= {"국어","영어","수학","자바","C","과학","사회","기가","한국사","일본어"};
		System.out.print("학생 수 : ");
		int stu=scan.nextInt();
		System.out.print("몇 과목 : ");
		int subj=scan.nextInt();
		int sum[]=new int[stu];
		String[] a=new String[stu]; //학번
		String[] b=new String[stu]; //이름
		int score[][]=new int[stu][10];
		int rank[]=new int[stu];
		
		for( int i=0; i<stu; i++){
			System.out.print((i+1)+"번째 학생\n");
			System.out.print("학번 : ");
			a[i]=scan.next();
			System.out.print("이름 : ");
			b[i]=scan.next();
			
			for(int k=0; k<subj; k++) {
				do{
					System.out.print(subj_name[k]+" : ");
					score[i][k]=scan.nextInt();
				}while(score[i][k]<0 || score[i][k]>100);
				sum[i]+=score[i][k];	
			}
			System.out.print("\n");
			rank[i]=1;
		}
		for(int i=0; i<stu; i++) {
			for(int j=i; j<stu; j++){
				if(sum[i]<sum[j])
					rank[i]++;
			}
		}
		for(int k=0; k<stu; k++){
			System.out.print(a[k]+" "+b[k]);
			for(int j=0; j<subj; j++){
				System.out.printf(" %d ",score[k][j]);
			}
			double il = (double)sum[k]/subj; //평균
			System.out.printf(" %2d",sum[k]);
			System.out.printf(" %.2f",il);
			int ak = (int)il/10;
			switch(ak){
				case 9 : System.out.print(" A"); break;
				case 8 : System.out.print(" B"); break;
				case 7 : System.out.print(" C"); break;
				case 6 : System.out.print(" D"); break;
				default : System.out.print(" E");
			}
			System.out.println(" "+rank[k]);
		}
		
			
	
		
	}
}
