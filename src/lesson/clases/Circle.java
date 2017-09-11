package lesson.clases;

public class Circle {
	private double r = 1.0;
	private String color = "red";
	
	
	/**
	 * Konstruktor
	 */
	public Circle() {
		System.out.println(r + " " + color);
		r = 20;
	}
	
	public double getR() {
		return r;
	}
	public void setR(double newR) {
		r = newR;
	}
}
