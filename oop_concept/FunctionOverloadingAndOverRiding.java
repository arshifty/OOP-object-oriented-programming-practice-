package oop_concept;

public class FunctionOverloadingAndOverRiding 
{
	
	
	public FunctionOverloadingAndOverRiding()
	{
		
	}
	
	
	public FunctionOverloadingAndOverRiding(int a,int b)
	{
		System.out.println("int int : "+(a+b));
	}
	
	public FunctionOverloadingAndOverRiding(int a, double b)
	{
		System.out.println("int float : "+a+b);

	}
	
	public FunctionOverloadingAndOverRiding(String s,int b)
	{
		System.out.println("String int : "+s+" "+b);

	}
	

	public void display(int a, int b)
	{
		System.out.println("\n\nint int : "+(a+b));

	}
	
	public void display(int a, double b)
	{
		System.out.println("int float : "+a+b);

	}
	
	public void display(String s, int b)
	{
		System.out.println("String int : "+s+" "+b);

	}
	
	public static void main(String args[])
	{

		FunctionOverloadingAndOverRiding obj=new FunctionOverloadingAndOverRiding();
		FunctionOverloadingAndOverRiding obj1=new FunctionOverloadingAndOverRiding(10,20);
		FunctionOverloadingAndOverRiding obj2=new FunctionOverloadingAndOverRiding(20,22.55);
		FunctionOverloadingAndOverRiding obj3=new FunctionOverloadingAndOverRiding("Ashif ", 20);
		
		
		obj.display(10, 30);
		obj.display(30, 20.36);
		obj.display("haha", 45);
		
		
	}	
}
