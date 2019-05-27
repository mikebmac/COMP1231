//**************************************************************************************************
// Sphere.java
//
// Date: 	May 26th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 1
//
// Represents a sphere, which is a 3D shape.
//**************************************************************************************************

public class Sphere extends Shape3D {

	private double _radius;
	
	public Sphere(double radius) {
		super("Sphere");
		
		_radius = radius;
	}
	
	//----------------------------------------------------------------------------------------------
	// Calculates volume of a cube.
	//		V = (4/3) * pi * r^3
	//----------------------------------------------------------------------------------------------
	private double Volume() {
		double volume = (4f / 3f) * Math.PI * Math.pow(_radius, 3);
		return volume;
	}
	
	//----------------------------------------------------------------------------------------------
	// Calculates surface area of a cube.
	//		SA = 4 * pi * r^2
	//----------------------------------------------------------------------------------------------
	private double SurfaceArea() {
		double surfaceArea = 4f * Math.PI * Math.pow(_radius, 2);
		return surfaceArea;
	}
	
	public String toString() {
		String volume = super.formatDouble(Volume());
		String surfaceArea = super.formatDouble(SurfaceArea());
		return "\n" + super.toString() + String.format(" with a radius of %s\n"
				+ "\tVolume: %s\n"
				+ "\tSurface Area: %s", _radius, volume, surfaceArea);
	}
}
