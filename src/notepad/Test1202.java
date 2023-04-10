package notepad;

import java.util.Scanner;
public class Test1202{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int final_price=0;
		int init_money=5000;
		int sum=0;
		while(true){
			System.out.print("과일 갯수를 입력하세요: ");
			int fruitB =sc.nextInt();
			if(fruitB==0) break;
			System.out.print("과일 종류를 입력하세요 : ");
			String fruitA =sc.next();
			sum=getPrice(fruitA,fruitB,init_money);
		}
		
		if(sum>=0) System.out.println("거스름돈 : "+sum);
		else System.out.println("구입불가");
	}
	public static int getPrice(String fruitA, int fruitB,int init_money){
		int num=0;
		switch(fruitA){
			case "수박" : num=init_money-(7000*fruitB); break;
			case "토마토" : num=init_money-(1000*fruitB); break;
			case "사과" : num=init_money-(1500*fruitB); break;
		}
		return num;
	}
}
