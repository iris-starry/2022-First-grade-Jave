package general;

public class ArrayExam3 {
	public static void main( String args[]) {
		int[] a=new int[3];
		a[0]= a[0]+1;
		a[1]= a[1]+2;
		a[2]= a[2]+3;
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"] = "+a[i]);
	}
}
