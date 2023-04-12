package general;

public class ArrayExzm13 {

	public static void main(String[] args) {
		// 배열 선언
		int num[][] = new int[4][4]; 
		int a=1;
		//배열 입력
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j]=(i*4+(j+1));
			}
				
		}
		//배열 출력
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++)
				System.out.printf("%3d",num[i][j]);
			System.out.println();
		}
	}

}