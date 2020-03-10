package oop_concept;

public class classB extends classA
{

	public void displayB()
	{
		System.out.println("\n>>hi i am class B >> displayB method");
		
		
	}
	
	
	public void display()
	{
		System.out.println("\n>>hi i am class D >> displayD method");
		System.out.println("\n>> "+numB);

		
	}
	
	
public int numB;

	
	public void setValB(int numB)
	{
		
		this.numB=numB;
	}
	
	public int getValB()
	{
       
		return numB;
	}
	
	
	public static  void main(String args[])
	{

		
		System.out.println("\n....hi i am class B main method...");

		
		classB objB=new classB();
		objB.displayB();
		
		objB.setValB(200);
		System.out.println("\nValue of b : "+objB.getValB());
		
        objB.displayA();
		
	

	}
}
