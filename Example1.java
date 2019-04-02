import java.util.*;

class Example1
	{
	public static void main(String g[])
		{
		LinkedList<String> obj=new LinkedList<String>();
		LinkedList<Float> ob=new LinkedList<Float>();

		obj.add("programming");		
		obj.add("language");
		obj.add("hello");
		obj.add("java");
		
		ob.add(12F);		
		ob.add(10.4F);
		ob.add(3.6F);
		ob.add(1.1F);
			
		ListIterator i=obj.listIterator();				
		
		System.out.println(obj.getLast());

		while(i.hasPrevious())
			{
			System.out.println(i.previous().toString());
			}
		}
	}
