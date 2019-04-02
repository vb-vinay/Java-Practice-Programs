import java.util.*;
class Arr_List
	{
	public static void main(String g[])
		{
		ArrayList<String> obj=new ArrayList<String>();
		
		String a[]=new String[5];
		a[0]=new String("this");

		a[1]="is";a[2]="a";a[3]="new";a[4]="element";		

		obj.add(a[0]);
		obj.add(a[1]);
		obj.add(a[2]);
		obj.add(a[3]);
		obj.add(a[4]);

		System.out.println(obj);
		}

	}