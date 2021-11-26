package ex1;

public class Cylinder {
	int radius = 0;
	int height = 0;
	
	public double getArea() {
		return (2* Math.PI * radius * radius) +(2* Math.PI* radius* height);
	}
	public double getVolume() {
		return Math.PI * height * radius * radius;
	}
}
