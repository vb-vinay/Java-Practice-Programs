class Base_class
	{
	public  int h;
	Base_class()
		{
		h=100;
		System.out.println("base");
		}
	void display()
		{
		System.out.println("Display method");
		}	
	}

class child1 extends Base_class
	{
	public int g;
	child1()
		{
		g=900;
		System.out.println("child");
		}
	void dis()
		{
		System.out.println("Dis method - H: "+h);
		}
	}
class child2 extends child1
	{
	void show()
		{
		System.out.println("show function");
		}
	}

class Use
	{
	public static void main(String p[])
		{
		child2 obj=new child2(); //const calling - base to child
		obj.display();
		obj.dis();
		obj.show();
		}
	}