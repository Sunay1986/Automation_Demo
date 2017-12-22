package InterfaceDemo;

interface webdriver 
{
		void click();
}
interface webdriver1
{
		void add();
}


class firefoxdriver implements webdriver,webdriver1
{

	public void click()
	{
		System.out.println("Defination for click");
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}
}

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webdriver driver=new firefoxdriver();
		driver.click();
		((webdriver1) driver).add();
	}

}
