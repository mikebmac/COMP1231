//**************************************************************************************************
// Cylinder.java
//
// Date: 	May 26th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 1
//
// Represents a cylinder, which is a 3D shape.
//**************************************************************************************************

public class Cylinder extends Shape3D {

	private double _radius;
	private double _height;
	
	public Cylinder(double radius, double height) {
		super("Cylinder");
		
		_radius = radius;
		_height = height;
	}
	
	//----------------------------------------------------------------------------------------------
	// Calculates volume of a cube.
	//		V = pi * r^2 * h
	//----------------------------------------------------------------------------------------------
	private double Volume() {
		double volume = Math.PI * Math.pow(_radius, 2) * _height;
		return volume;
	}
	
	//----------------------------------------------------------------------------------------------
	// Calculates surface area of a cube.
	//		SA = 2 * pi * r * h + 2 * pi * r^2
	//----------------------------------------------------------------------------------------------
	private double SurfaceArea() {
		double surfaceArea = 2f * Math.PI * _radius * _height +
								2f * Math.PI * Math.pow(_radius, 2);
		return surfaceArea;
	}
	
	public String toString() {
		String volume = super.formatDouble(Volume());
		String surfaceArea = super.formatDouble(SurfaceArea());
		return "\n" + super.toString() + String.format(" with a radius of %s and a height of %s\n"
				+ "\tVolume: %s\n"
				+ "\tSurface Area: %s", _radius, _height, volume, surfaceArea);
	}

}
