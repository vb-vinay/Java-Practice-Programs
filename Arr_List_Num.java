import java.util.*;
class Arr_List_Num
	{
	public static void main(String g[])
		{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);

		System.out.println(obj);

		Iterator i=obj.iterator();
		while(i.hasNext())
			{
			Integer p=(Integer)i.next();
			System.out.println(p);			
			}		
		}

	}