package oop_concept;

import javax.swing.JOptionPane;

public class PolyMorphisam {

	public static void main(String args[])
	{
		JOptionPane.showMessageDialog(null, "PolyMorphisam holo \n ekta super class er ekadhik object create kore \n ekadhik class er constructor ke daka");
		
		
		polyMorphisam1 obj=new polyMorphisam1();
		polyMorphisam1 obj1=new polyMorphisamBanana();
		polyMorphisam1 obj2=new polymorphisamApple();	    
	
		obj.display();
		obj1.display();
		obj2.display();
	}
}
