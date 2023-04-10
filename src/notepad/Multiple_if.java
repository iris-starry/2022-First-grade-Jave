package notepad;

import java.util.Scanner;
public class Multiple_if{
	public static void main(String args[ ]){
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int number = scan.nextInt();
		if(!(number % 3==0 || number % 51==0 || number % 8==0))
			System.out.println("어느 배수도 아니다");
		else{
			if(number%3==0) System.out.println(number +"은 3의 배수이다."); 
			if(number%5==0) System.out.println(number +"은 5의 배수이다.");
			if(number%8==0) System.out.println(number +"은 8의 배수이다.");
		}		
}
}
