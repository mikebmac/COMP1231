//**************************************************************************************************
// Driver.java
//
// Date: 	May 26th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 1
//
// The 
//**************************************************************************************************
public class Driver {


	public static void main(String[] args) {
		Shape3D[] shapes = new Shape3D[6];
		
		shapes[0] = new Cube(8f);
		shapes[1] = new Sphere(2f);
		shapes[2] = new Cylinder(2f, 8f);
		
		shapes[3] = new Cube(9.5f);
		shapes[4] = new Sphere(0.5f);
		shapes[5] = new Cylinder(44f, 0.1f);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}

	}

}
