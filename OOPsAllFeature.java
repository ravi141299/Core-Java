import java.util.*;
import java.lang.*;
class one{
	public void display()
	{
		System.out.println("class one is called");
	}
}
//inheritence
class two extends one{
	
	public void display()   // overriden
	{
		System.out.println("class two is called");
	}
	
	// overloading
	public void add(int a,int b)
	{
		System.out.println("int's added "+(a+b));
	}
	
	public void add(float a,float b)
	{
		System.out.println("Double's added "+(a+b));
	}
}
class encap{
	private String name;
	
	public void setname(String s)
	{
		name = new String(s);
	}
	public String getname()
	{
		return name;
		//System.out.println("My name is "+name);
	}
}
abstract class A{
	abstract public void run();
	
}
class B extends A{
     public void run()
	{
		System.out.println("Bike is Running ");
	}
}

public class AllFeature{
	public static void main(String aa[])
	{
		one o1 = new two();
		o1.display();
		
		//o1.add(5,6);  // error
		
		two o2 = new two();
		o2.add(6,10);
		o2.add(4.2f,5.8f);
		
		encap en = new encap();
		en.setname("Ravi Shankar Jaiswal");
		System.out.println("My name is "+en.getname());
		
		A a = new B();
		a.run();
		
		
	}
	
}