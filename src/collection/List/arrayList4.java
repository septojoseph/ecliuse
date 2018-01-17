package collection.List;

import java.util.ArrayList;

class employe 
{
	    int eno;
		String name;
		int sal;
		employe(int eno,String name,int sal)
		{
			this.eno = eno;
			this.name = name;
			this.sal = sal;
		}
		public String toString()
		{
			String info="no "+eno+" name "+name+" salary "+sal;
			return info;
		}
}
public class arrayList4
{

	public static void main(String[] args) 
	{
		System.out.println("pro starts..");
		
		ArrayList a1 = new ArrayList();
		a1.add(new employe(01,"midun",3000));
		a1.add(new employe(02,"ardra",3000));
		a1.add(new employe(03,"beena",3000));
		a1.add(new employe(04,"teena",3000));
		for(int index=0;index<a1.size();index++)
		{
			Object obj = a1.get(index);
			System.out.println(obj);
		}

	}
}

 
