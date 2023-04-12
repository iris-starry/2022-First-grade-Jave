package general;

public class ArrayExam14 {

	public static void main(String[] args) {
		// 배열 선언 및 할당
		int num[][] = new int[4][]; 
		int a=1;
		for(int i=0; i<num.length; i++) {
			num[i]=new int[i+1];
		//배열 입력
			for(int j=0; j<num[i].length; j++) {
				num[i][j]=a++;
			}
				
		}
		//배열 출력
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++)
				System.out.printf(" %d ",num[i][j]);
			System.out.println();
		}
	}

}
