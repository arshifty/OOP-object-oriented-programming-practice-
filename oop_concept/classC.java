package oop_concept;

public class classC extends classB
{
	public int numC;
	protected void displayC()
	{
		System.out.println("\n>>hi i am class C >> displayC method");
		
		
	}
	
	public void display()
	{
		System.out.println("\n>>hi i am class D >> displayD method");
		///System.out.println("\n>> "+numC);

		
	}
	
	
	

	
	public void setValC(int numC)
	{
		
		this.numC=numC;
	}
	
	public int getValC()
	{
		
		
		return numC;
	}
	
	
	
	
	public static  void main(String args[])
	{
		
		System.out.println("\n....hi i am class C main method...");

		
		
		classC objC=new classC();
		objC.displayC();
		
		objC.setValC(300);
		System.out.println("\nValue of c : "+objC.getValC());
		
	}
}
