package notepad;

import java.util.Scanner;
public class sunhee{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int stu=scan.nextInt();
		for( int i=1; i<=stu ; i++){
			System.out.print(i+"번째 학생\n");
			System.out.print("학번 : ");
			String a=scan.next();
			System.out.print("이름 : ");
			String b=scan.next();
			int c;
			do{
				System.out.print("국어 : ");
				c=scan.nextInt();
				//if(c>=0 && c<=100) break;
			}while(c<0 || c>100);
			int d;
			do{
				System.out.print("수학 : ");
				d=scan.nextInt();
				if(d>=0 && d<=100) break;
			}while(d<0 || d>100);
			int e;
			do{
				System.out.print("영어 : ");
				e=scan.nextInt();
				if(e>=0 && e<=100) break;
			}while(e<0 || e>100);
			int f;
			do{
				System.out.print("자바 : ");
				f=scan.nextInt();
				if(f>=0 && f<=100) break;
			}while(f<0 || f>100);
			System.out.print(a+" "+b);
			System.out.printf(" %d %d %d %d",c,d,e,f);
			int sk = c+d+e+f;
			double il = (double)sk/4;
			System.out.printf(" %d",sk);
			System.out.printf(" %.2f",il);
			int ak = (int)il/10;
			switch(ak){
				case 9 : System.out.println(" A"); break;
				case 8 : System.out.println(" B"); break;
				case 7 : System.out.println(" C"); break;
				case 6 : System.out.println(" D"); break;
				default : System.out.println(" E");
			}
			System.out.print("\n");
		}
			
	
		
		
	}
}
