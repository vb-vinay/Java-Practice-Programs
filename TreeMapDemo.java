	import java.util.*;
	class TreeMapDemo
	{
	public static void main(String arg[])
	{
TreeMap hm=new TreeMap();

	System.out.println(hm.size());
	hm.put("1001","aaa");
	hm.put("1003","ccc");
	hm.put("1004","ddd");
	hm.put("1002","bbb");
	System.out.println(hm.size());
	Set s=hm.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext())
		{
		Map.Entry e=(Map.Entry)i.next();
		String k=(String)e.getKey();
		String v=(String)e.getValue();
		System.out.println(k + "="+v);
		}
	}
}