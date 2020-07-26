package task6;
import java.util.*;
public class Collections
{
	static ArrayList<String> ll=new ArrayList<String>();
	static void print()
	{
		int n=ll.size();
		for (int i=0;i<n;i++)
		{
			System.out.println(ll.get(i));
		}
	}
	static void fetch(int x)
	{
		System.out.println("choclate is:"+ll.get(x));
	}
	static void add(String name)
	{
		ll.add(name);
		System.out.println("successfully added");
	}
	static void remove(int n)
	{
		String s=ll.get(n);
		ll.remove(n);
		System.out.println("successfully removed**    "+s);
	}
//Choclate names will be added,printed and removed in this application

	public static void main(String[] z)
	{
		Scanner w=new Scanner(System.in);
		ll.add("kit kat");
		ll.add("dairy milk");
		ll.add("perk");
		ll.add("galaxy");
		ll.add("fivestar");
		ll.add("mars");
		ll.add("bounty");
		ll.add("munch");
		ll.add("twix");
		ll.add("nestle");
		System.out.println("Initial List");
		print();
		while(true)
		{
			System.out.print("1.print\t2.fetch\t3.remove\t4.add\t5.exit\nEnter operation :");
			int n=w.nextInt();
			if(n==1)
			{
				print();
			}
			else if(n==2)
			{
				System.out.print("enter choclate index:");
				int x=w.nextInt();
				fetch(x);
			}
			else if(n==3)
			{
				System.out.print("enter index of choclate:");
				int x=w.nextInt();
				remove(x);
			}
			else if(n==4)
			{
				System.out.print("enter index where to add :");
				String x=w.next();
				add(x);
			}
			else
			{
				break;
			}
		}
		System.out.println("exited");
	}
}

