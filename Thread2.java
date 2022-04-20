package n19April;

class Printer
{
	synchronized void printer(String docname)
	{
		for(int i =0;i<10;i++)
		{
			System.out.println(docname+":" + (i+1)+ "process running");
		}
	}
}
class MyThread extends Thread
{
	Printer p1;
	MyThread(Printer p1)
	{
		this.p1 = p1;
	}
	public void run()
	{
		p1.printer("Ram");
	}
}

class YourThread extends Thread
{
	Printer p1;
	YourThread(Printer p1)
	{
		this.p1 = p1;
	}
	public void run()
	{
		p1.printer("Shyam");
	}
}

public class Thread2 {
	public static void main(String args[])
	{
		System.out.println("=============System started===========");
		Printer p1 = new Printer();
		MyThread m1 = new MyThread(p1);
		YourThread y1 = new YourThread(p1);
		m1.start();
		y1.start();
		System.out.println("=============System Stopped===========");
	}

}
