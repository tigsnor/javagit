package ex08class;

class A {
	public int a = 10;
}

class B {
	public static int b = 10;
}


public class Test
{
	public static void main(String[] args)
	{
		A a = new A();
		a.a = 100;
		
		B.b = 99;
	}
}
