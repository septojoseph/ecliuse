package collection.List;

import java.util.ArrayList;

public class arraylist3
{
	public static void main(String[] args)
	{
		System.out.println("pro starts..");
		ArrayList a1 = new ArrayList();
		a1.add(new String ("hello"));
		a1.add(10);
		a1.add(89);
		a1.add(20);
		a1.add(34);
		
		  //methodes in arraylist
		
		System.out.println(a1.contains("hello"));
		System.out.println("size= " +a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove(0));
		System.out.println(a1.contains("hello"));
		a1.clear();
		System.out.println(a1.size()+"=size");
	}
	}



