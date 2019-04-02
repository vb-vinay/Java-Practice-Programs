class A
{
	void display()
		{
		System.out.println("A class");
		}
}

class B
{
	void show()
		{
		System.out.println("B class");		
		}
}

class C
{
	void dis()
		{
		System.out.println("C class");		
		}
	public static void main(String g[])
		{	
		System.out.println("C class's main method");
		}
}

class D
	{
	void main()
		{
		System.out.println("main local method");	
		}
	
	public static void main(String g[])
		{
		A oa=new A();
		B ob=new B();
		C oc=new C();
		D od=new D();

		oa.display();
		ob.show();
		oc.dis();
		od.main();

		}
	}