package n19April;

public class Equals {
	public static void main(String args[])
	{
		String name1 = "Avinash";
		String name2 = "Avinash";
		if(name1 == name2)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		String name3 = new String("Avinash");
		String name4 = new String("Avinash");
		
		if(name3 == name4)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
