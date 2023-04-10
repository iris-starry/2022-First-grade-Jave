package notepad;

import java.util.Scanner;
public class Salary_Switch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("현 연봉을 입력하세요 : ");
		double currentSalary = sc.nextDouble();
		System.out.print("근무평가등급을 입력하세요 : ");
		String rating = sc.next();
		System.out.println(setRating(rating,currentSalary));
		/*newSalary = currentSalary+raise;
		System.out.println("연봉인상액 : "+(int)raise);
		System.out.println("새 연봉인상액 : " +(int)newSalary);*/
	}
	static int setRating(String rating, double currentSalary){
		int raise=0;
		switch(rating){
			case "우수" : raise= (int)(currentSalary*0.06); break;
			case "보통" : raise= (int)(currentSalary*0.04); break;
			case "불량" : raise= (int)(currentSalary*0.02); break;
		}
		int newSalary = (int)(currentSalary+raise);
		return newSalary;
	}
}
