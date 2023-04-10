package notepad;

import java.util.Scanner;
public class For_Test4{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("몇 번? : ");
		int n =scan.nextInt();
		int num=1;
		double sum=0;
		for(int i=1; i<=n; i++){
			if(n%5==0) System.out.println();
			if(i==1){
				System.out.print("1");
				sum+=1;
				num++;
			}
			else{
				System.out.print("+(1/"+num+")");
				sum+=1/(double)num;
				num++;
			}
		}
		System.out.println(" = "+sum);
	}
}
