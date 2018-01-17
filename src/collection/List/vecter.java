package collection.List;


import java.util.Vector;

class employee 
{
	    int eno;
		String name;
		int sal;
		employee(int eno,String name,int sal)
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
public class vecter
{

	public static void main(String[] args) 
	{
		System.out.println("pro starts..");
		
		Vector a1 = new Vector();
		a1.add(new employee(01,"septo",3000));
		a1.add(new employee(02,"joseph",3000));
		a1.add(new employee(03,"stephen",3000));
		a1.add(new employee(04,"rijo",3000));
		for(int index=0;index<a1.size();index++)
		{
			Object obj = a1.get(index);
			System.out.println(obj);
		}

	}
}

