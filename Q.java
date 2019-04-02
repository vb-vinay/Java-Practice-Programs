class Q
{
public static int a;
static 
	{
	a=9;	
	System.out.println("static block.");	
	}
Q()
	{
	
	System.out.println("default const.");
	}

void work()
	{
		a++;
	}

void display()
	{
	System.out.println("\n"+a);
	}
public static void main(String g[])
	{
	/*new Q().work();	
	new Q().work();
	new Q().work();
	new Q().work();
	new Q().work();
	new Q().display();*/

	Q obj = new Q(); obj.work();	
	Q obj1 = new Q();obj1.work();
	Q obj2 = new Q();obj2.work();
	Q obj3 = new Q();obj3.work();
	Q obj4 = new Q();obj4.work();
	obj4.display();
	}
}