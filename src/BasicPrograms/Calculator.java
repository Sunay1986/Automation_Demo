package BasicPrograms;

public class Calculator {
	public int numb;
	
	public void add(){
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	protected void sub(int a, int b){
		System.out.println(a-b);
	}
	public static void sub1(int a,int b){
		System.out.println(a-b);
	}
	
	public Calculator(int a) {
		System.out.println("Inside Parametarized constructor....");
		numb=a;
	}
	public Calculator() {
		System.out.println("Inside Default constructor.....");
	}
}
