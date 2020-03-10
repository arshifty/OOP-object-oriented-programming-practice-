package oop_concept;

public class classD extends classC
{

	public void displayD()
	{
		System.out.println("\n>>hi i am class D >> displayD method");
		
		
	}
	
	/*public void display()
	{
		System.out.println("\n>>hi i am class D >> displayD method");
		System.out.println("\n>> "+numD);

		
	}
	*/
	
    private int numD;
	
	public void setValD(int numD)
	{
		
		this.numD=numD;
	}
	
	public int getValD()
	{
		
		
		return numD;
	}
	
	
	public static  void main(String args[])
	{
		
		System.out.println("\n....hi i am class D main method...");

		classD objD=new classD();
		objD.displayD();
		
        
		objD.setValD(300);
		System.out.println("\nValue of d : "+objD.getValD());		
		objD.displayC();

		
	}
}
