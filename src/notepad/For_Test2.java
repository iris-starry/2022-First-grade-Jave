package notepad;

public class For_Test2{
	public static void main(String args[]){
		int num=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%02d",num);
				num++;
			}
			System.out.println();
		}
	}
}

