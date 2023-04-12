package general;

public class ArrayExam12 {

	public static void main(String[] args) {
		// 배열 선언
		int num[][] = new int[4][4];
		// 배열 입력
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++)
				num[i][j]=1;
		}
		// 배열 출력
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++)
				System.out.print(num[i][j]+"\t");
			System.out.println();
		}
	}

}
