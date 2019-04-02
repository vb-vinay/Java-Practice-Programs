class Student
{
int rollno;
String name;
int cl;

void value()
	{
	rollno=12;
	name="pooja";
	cl=5;
	}

void display()
	{
	System.out.println("\nRollno :"+rollno);
	System.out.println("\nName :"+name);
	System.out.println("\nClass :"+cl);
	}


public static void main(String g[])
	{
	Student S=new Student();
	S.value();
	S.display();
	}
}