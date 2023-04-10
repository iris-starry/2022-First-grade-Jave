package test;

import java.util.Scanner;

class Ac{
	String user;
	
	int money;
	
	//입금
	void deposit(int a) {
		money+=a;
	}
	//출금
	void withdraw(int b) {
		if(money<b) {
			System.out.println("출금하려는 계좌의 잔액이 부족하여 출금이 불가능합니다.");
		}
		else money-=b;
	}
	//출력
	void print(){
		
		System.out.println("계좌번호 "+user+"의 현재 잔액 : "+money);
	}
}
public class Account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ac Ac1 = new Ac();
		
		
		int input=0;
		int output=0;
		
		System.out.println("===============================");
		System.out.print("계좌번호 입력 : ");
		Ac1.user=sc.next();
		Ac1.print();
		System.out.println();
		System.out.print("입금할 금액 : ");
		input=sc.nextInt();
		Ac1.deposit(input);
		Ac1.print();
		System.out.println();
		System.out.print("출금할 금액 : ");
		output=sc.nextInt();
		Ac1.withdraw(output);
		Ac1.print();
		
		Ac Ac2 = new Ac();
		System.out.println("===============================");
		System.out.print("계좌번호 입력 : ");
		Ac2.user=sc.next();
		Ac2.print();
		System.out.println();
		System.out.print("입금할 금액 : ");
		input=sc.nextInt();
		Ac2.deposit(input);
		Ac2.print();
		System.out.println();
		System.out.print("출금할 금액 : ");
		output=sc.nextInt();
		Ac2.withdraw(output);
		Ac2.print();
		
		Ac Ac3 = new Ac();
		System.out.println("===============================");
		System.out.print("계좌번호 입력 : ");
		Ac3.user=sc.next();
		Ac3.print();
		System.out.println();
		System.out.print("입금할 금액 : ");
		input=sc.nextInt();
		Ac3.deposit(input);
		Ac3.print();
		System.out.println();
		System.out.print("출금할 금액 : ");
		output=sc.nextInt();
		Ac3.withdraw(output);
		Ac3.print();
		
		
		System.out.println("===============================");
		System.out.println("계좌번호           잔액");
		Ac1.print();
		Ac2.print();
		Ac3.print();
		System.out.println("===============================");
		
	}

}


