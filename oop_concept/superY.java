package oop_concept;

public class superY extends superZ
{
  public int x;
	
	
  public superY(int x)
  {
	  super(5);
	  this.x=x;
	System.out.println("\nX = "+x);

  }
  
	public void displayY()
	{
		System.out.println("This is superY display class");
	}
	
}
