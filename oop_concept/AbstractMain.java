package oop_concept;

abstract class product
{
	
	int a;
	public abstract void display();
	public abstract void display2();

	
	public product(int a)
	{
		this.a=a;
		System.out.println("product class  a = "+a);
	}
	

}

abstract class abs2 extends product
{
	
	public abs2(int s)
	{
		super(s);
	}
	
	public  void display2()
	{
		
		System.out.println("This is display method in abs2 class a*3= "+a*3 );		
	}
	
}

class AbstructMyClass extends abs2
{
	
	public AbstructMyClass(int b)
	{
		super(b);
	}
	public void display()
	{
		System.out.println("  myClass inherited abstruct class and method display ");
		System.out.println("\nmyClass inherited abstruct class  a *5 =  "+ a*5);

	}
	
	
	
}


public class AbstractMain {
	
	
	public static void main(String args[])
	{
		AbstructMyClass obj=new AbstructMyClass(20);
		///obj.a=50;
		obj.display();
		
		///obj.a=60;
		obj.display2();
		
	}

}
