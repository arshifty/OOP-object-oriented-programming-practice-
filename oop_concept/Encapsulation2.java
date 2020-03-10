package oop_concept;

public class Encapsulation2 {

	public static void main(String[] args) {
		Encapsulation1  obj  =  new  Encapsulation1();
		
		
		obj.setCode(50);
		obj.setName("Ashif Rahman");
		obj.setAge(25);
		
		
		System.out.println("CODE : "+obj.getCode());
		System.out.println("Name : "+obj.getName());
		System.out.println("Age : "+obj.getAge());

	}

}
