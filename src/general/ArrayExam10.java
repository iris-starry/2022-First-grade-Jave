package general;

public class ArrayExam10 {

	public static void main(String[] args) {
		int a[];
		int[] b;
		int[] c = {31,32,3};
		a=new int[4];
		b=new int[] {21,22,23,24};
		c=b;
		System.out.println(a.length+" "+b.length+" "+c.length);
	}
}
