package oop_concept;

public class classA {

	public int numA;
	
	public classA()
	{
		getValA();
	}
	
	
	public void displayA()
	{
		System.out.println("\n>>hi i am class A >> displayA method");
		
		
	}
	
	public void display()
	{
		System.out.println("\n>>hi i am class D >> displayD method");
		System.out.println("\n>> "+numA);

		
	}
	
	
	
	public void setValA(int numA)
	{
		
		this.numA=numA;
		
	}
	
	public int getValA()
	{
		
		
		return numA;
	}
	
	
	
	public static  void main(String args[])
	{
		
		System.out.println("\n....hi i am class A main method...");

		classA objA=new classA();
		objA.displayA();
		
		objA.setValA(100);
		System.out.println("\nValue of a : "+objA.getValA());
		
	}

	


	}
	
	

