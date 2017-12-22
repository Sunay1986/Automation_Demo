package Inheritance;


	abstract class Animal {
		
		public abstract void talk();
		
				
	}

	class Cat extends Animal {
		
		
		public void talk() {

			System.out.println("Mewoooo!!!!");
		}

		public void catStyle() {

			System.out.println("This is cat method");
		}
	}

	class Dog extends Animal {
		
		public void talk() {

			System.out.println("Bhow!!!!");
		}

		
	}
	
	public class Test2 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Animal animal=new Dog();
			animal.talk();
			
		}
}

	
		

