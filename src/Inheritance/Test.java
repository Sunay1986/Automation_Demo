package Inheritance;

class Father {
	protected void fatherStyle() {

		System.out.println("This is father method");
	}

}

class Son extends Father {

	public void sonStyle() {

		System.out.println("This is son method");
	}
}

class grandSon extends Son {

	public void grandSonStyle() {

		System.out.println("This is granson method");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();
		father.fatherStyle();

		Son son = new Son();

		son.fatherStyle();
		son.sonStyle();
		
		grandSon granson=new grandSon();
		granson.grandSonStyle();
		granson.fatherStyle();
		granson.sonStyle();

	}

}
