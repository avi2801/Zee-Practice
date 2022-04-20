package n19April;
import java.util.*;
public class Thread3 {
	public static void main(String args[])
	{
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(23);
		a1.add("hello");
		a1.add("hi");
		a1.add(78);
		a1.add(89);
		for(int i =0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("New Iterator type");
		Iterator i = a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
