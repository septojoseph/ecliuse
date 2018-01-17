package collection.List;

import java.util.ArrayList;

public class araylist2
{

	public static void main(String[] args) 
	{
		System.out.println("pro starts..");
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(89);
		a1.add(20);
		a1.add(34);
		for(int index=0;index<a1.size();index++)
		{
			Object obj = a1.get(index);
			System.out.println(obj);
		}

	}

}

