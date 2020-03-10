package oop_concept;

public class superX extends superY
{
	
public void displayX()
{
	System.out.println("This is superX display class");
}

public int y;

public superX(int a,int b)
{
	super(a);
	y=b;

	int s=super.x;
	int w=super.z;
	int sum=b+s+w;
	System.out.println("\nY = "+y+"\nSum : "+sum);
	
	
}

}
