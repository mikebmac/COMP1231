//**************************************************************************************************
// Driver.java
//
// Date: 	July 23th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 4
//
// A driver class
//**************************************************************************************************
package Assignment1;

public class Driver {

	public static void main(String[] args) {
		String[] names = {"Michael MacKay", "Jane Doe", "Sarah Sting", "Issac Newton" };
		Parade parade = new Parade(names);
		System.out.println("Created Parade:");
		System.out.println(parade);
		
		parade.removeClown();
		parade.removeClown();
		System.out.println("\nRemove 2:");
		System.out.println(parade);
		
		parade.addClown("Angie Forsynth");
		parade.addClown("Dannie McPhee");
		System.out.println("\nAdded 2:");
		System.out.println(parade);
	}

}
