import java.util.*;

class Employee
	{
	int empid;
	String name;

	class Address  //also refered as nested class (HAS-A)
		{
		int houseno;
		String city;
		}


	void enter()
		{
		Scanner	S=new Scanner(System.in);
		Address A=new Address();
				
		System.out.println("Empid: "); empid=S.nextInt();
		System.out.println("Name: "); name=S.next();
		System.out.println("Houseno: ");A.houseno=S.nextInt();						System.out.println("City: "); A.city=S.next();		
		}

	public static void main(String g[])
		{
		Employee E=new Employee();
		E.enter();				
		}	
	
	}