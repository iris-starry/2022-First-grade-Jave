package Class;

class Test{
	void show(String str){
		System.out.println("매개변수가 전달됨 : "+ str);
	}
	void show() {
		System.out.println("동일한 이름의 매서드가 있어도 오류가 이닙니다. 매개변수가 다른 오버로딩 된 매서드입니다. ");
	}
}
public class Class_Test02 {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.show();
		t1.show("mirim");

	}

}
