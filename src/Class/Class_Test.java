package Class;

class Car{
	String model;
	String company;
	int price;
	void SpeedUp() {
		System.out.println(model+"속도를 올립니다.");
	}
	void Stop() {
		System.out.println("멈춥니다");
	}
}

public class Class_Test {

	public static void main(String[] args) {
		Car kim=new Car();
		kim.model="모닝";
		kim.company="기아";
		kim.price=1500;
		kim.SpeedUp();
		kim.Stop();
		
		Car min=new Car();
		min.model="람보르기니";
		min.company="폭스바겐";
		min.price=20000;
		min.SpeedUp();
		min.Stop();
		
		

	}

}
