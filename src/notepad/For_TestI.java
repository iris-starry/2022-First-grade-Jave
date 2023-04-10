package notepad;

public class For_TestI{
	public static void main(String args[]){
		for(int i=0 ; i<10 ; i++){
			for(int j=1; j<=10; j++){
				if(j%3==0){
	 				System.out.print(" X ");
				}
				else{ 
					System.out.print(" "+(i*10+j)+" ");
				}
			}
			System.out.println();
		}
	}
}
