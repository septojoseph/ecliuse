package collection.List;

import java.util.ArrayList;

public class arraylist1
{

	public static void main(String[] args) 
	{
		System.out.println("pro starts....");
		ArrayList a1 = new ArrayList();
		a1.add(new Object());
		a1.add(new Object());
		a1.add(new String ("hello"));
		a1.add(new StringBuffer("java"));
		
		//System.out.println(a1);
		
		Object obj = a1.get(0);
		
		
		for(int index=0;index<a1.size();index++)
		{
			Object ref = a1.get(index);
			System.out.println(ref);
		}
		System.out.println("pro end....");
		}
		

	}


