import java.util.*;
class Circle
{

void work()
	{
	int ch;

	float a,c,r,pie=3.14F;

	System.out.println("\nMain Menu\n");
	System.out.println("1: Area\n");
	System.out.println("2: Circumference\n");
	System.out.println("Enter your choice:");

	Scanner sc=new Scanner(System.in);

	ch=sc.nextInt();

	System.out.println("Enter radius:");
	
	r=sc.nextFloat();	

	
	switch(ch)
		{
		case 1:
			a=pie*r*r;
			System.out.println("Area is: "+a);
			break;
		case 2:
			c=2*pie*r;
			System.out.println("Circumference is: "+c);
			break;
		default:
			System.out.println("Invalid choice");			

		}


	}

public static void main(String g[])
	{
	Circle obj=new Circle();
	obj.work();
	}
}