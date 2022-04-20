package n19April;
class A extends Thread
{
	public synchronized void run()
	{
		try {
			int count = 0;
			for(int i =0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName() +": " +(i+1));
				Thread.sleep(1);
			}
			count++;
			System.out.println(count);
			
		}
		catch(Exception e)
		{
			
		}
	}
}
/*class B extends Thread
{
	public void run()
	{
		try {
			for(int i =0;i<=10;i++)
			{
				System.out.println("B class" + i);
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
	
}*/
public class Thread1 {
	public static void main(String args[])
	{
//		A a = new A();
//		B b = new B();
//		a.start();
//		b.start();
		A a = new A();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		System.out.println(t1);
		System.out.println(t2);
		t1.setName("A1");
		t2.setName("A2");
		t1.start();
		t2.start();
	
		t1.setPriority(8);
		t2.setPriority(3);
	}
}
