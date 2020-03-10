package oop_concept;


interface interface1
{
	
	public int a=10;
	public int b=20;
	public static final int c=30;
	
	public void display();
	/// method definition  declare korte hbe ja public hote hbe ....
	
}
///interface ke always implements korte hoy
class myClass implements interface1 , interface2
{
	
	public void display()
	{
		int d=a+b+c;
		System.out.println("\nthis is interface 1  method >> SUM  : "+d);
	}
	
	public void DisplayOut()
	{
		int s=y+i;
		System.out.println("\nthis is interface 2  method >> SUM  : "+s);

	}
}


public class InterfaceMain
{
	
	public static void main(String args[])
	{
		
		myClass  obj = new myClass();
		obj.display();
		obj.DisplayOut();
		
		
		interface1 obj2;
		interface2 obj3;
		
		
		obj2 = new myClass();
		obj3 = new myClass();
		
		System.out.println("    from interface 1 Value of a = "+obj2.a);
		System.out.println("    from interface 1 Value of b = "+obj2.b);
		System.out.println("    from interface 1 Value of c = "+obj2.c);
		
		System.out.println("\n\n    from interface 2 Value of i = "+obj3.i);
		System.out.println("\n\n    from interface 2 Value of y = "+obj3.y);


        int totalSum=obj2.a+obj2.b+obj2.c+obj3.i+obj3.y;
        System.out.println("\nThe summation of interface 1 and ineterface 2 = "+totalSum);

		
	}
}
