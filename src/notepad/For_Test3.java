package notepad;

public class For_Test3{
	public static void main(String args[]){
		int num=1;
		double sum=0;
		int i=1;
		for( ; i<=20; i++){
			for(int j=1; j<=5; j++){
				if(i==1&&j==1){
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
			System.out.println();
		}
		System.out.println(" = "+sum);
	}
}
