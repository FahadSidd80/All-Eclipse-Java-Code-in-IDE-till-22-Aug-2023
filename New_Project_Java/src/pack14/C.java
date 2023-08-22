package pack14;
import pack13.A;

class C extends A {

	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
		
		C c = new C();
		c.m1();
		
		
		A a1 = new C();
		a1.m1();
	}
	
}
