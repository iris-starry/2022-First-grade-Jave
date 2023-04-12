package general;

class Account{
	private String account;
	private int balance;
	static int cnt;
	static final double interest=0.02;
	Account(){
		System.out.println("객체 생성");
		cnt++;
	}
	Account(String account){
		this.account=account;
		System.out.println(toString());
		cnt++;
	}
	void deposit(double money){
		balance+=money;
		System.out.println("입금 : "+money+" 잔액 : "+balance);
		System.out.println(toString());
	}
	void withdraw(double money) {
		if(balance<money) {
			System.out.println("잔액이 부족합니다");
		}
		else {
			this.balance-=money;
			System.out.println("출금 : "+money+" 잔액 : "+balance);
			System.out.println(toString());
		}
	}
	public String toString() {
		return "계좌번호 "+account+"의 잔액은 "+balance+"원 입니다.";
	}
	String getacount(){
		return account;
	}
	void setBalance(int a){
		balance=a;
	}
	String getAccNum(){
		return account;
	}
	int fixedDeposit(int year, int money){
		
		return money+=(int)(money*interest*year);
	}
}
