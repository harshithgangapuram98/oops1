package mypackage;

class EnglishMessage
{
	public void sayHi()
	{
		System.out.println("Hi");
	}
	
	public void sayHello()
	{
		System.out.println("Hello");
	}
	
	public void sayGm()
	{
		System.out.println("Good morning");
	}
}


class HindiMessage extends EnglishMessage
{
	@Override
	public void sayGm()
	{
		System.out.println("Shubodhay");
	}
}

public class MyClass {

	public static void main(String[] args) {
		

	}

}
