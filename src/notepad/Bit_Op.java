package notepad;

public class Bit_Op{
	public static void main(String args[]){
		int x = 0x0FFF;
		System.out.printf("%d\n", x);
		System.out.printf("%o\n", x);
		System.out.printf("%X\n", (x<<4));
		System.out.printf("%d\n", (x<<4));
		System.out.printf("%X\n", (x>>4));
		int y= -1;
		System.out.printf("%X\n", y);
		System.out.printf("%X\n", (y<<4));
		System.out.printf("%X\n", (y>>4));
		System.out.printf("%d\n", (y<<4));
		System.out.printf("%d\n", (y>>4));
		System.out.printf("%X\n", (y>>>4));
		System.out.printf("%d\n", (y>>>4));
		
	}
}