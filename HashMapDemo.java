	import java.util.*;
	class HashMapDemo
		{
		public static void main(String arg[])
		{
		HashMap hm=new HashMap();
		System.out.println(hm.size());  //0
		hm.put("1001","aaa");
		hm.put("1002","bbb");
		hm.put("1003","ccc");
		hm.put("1004","ddd");
		hm.put("1005","ddd");  // all key and values
	System.out.println(hm);  //JVM will print all keys and values by its own	 		
		System.out.println(hm.size()); //5
		Set s=hm.entrySet(); // fetch all object location to Set
		Iterator i=s.iterator();  // make iterator to traverse 
		while(i.hasNext()) 
		{
	Map.Entry e=(Map.Entry)i.next();  // Object is typecast to Map.Entry
	String k=(String)e.getKey();  
	String v=(String)e.getValue();
	System.out.println(k + "="+v);
		}
		}
	}












