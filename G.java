	class S
	{
	int a,b;

		S()
			{
				a=4;
				b=5;
	
			}
	
	void Swap_byVal(int i,int j)
		{
		int z;
		z=i;
		i=j;
		j=z;
		}
	void Swap_byRef(S obj)
		{
		int z;
		z=obj.a;
		obj.a=obj.b;
		obj.b=z;
		}	
	void work()
		{
		S ob=new S();
		ob.Swap_byVal(ob.a,ob.b);
		ob.display();		
		
		ob.Swap_byRef(ob);
		ob.display();
		}

	void display()
		{
		System.out.println("\nA : "+this.a);
		System.out.println("\nB : "+this.b);
		}

	public static void main(String g[])
		{
			new S().work();		
		}
	}
