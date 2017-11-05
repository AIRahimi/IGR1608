package modul8;

public class TestRegularPolygon {
	
	public static void main(String[] args) {
		RegularPolygon uno = new RegularPolygon();
		RegularPolygon dos = new RegularPolygon(6, 4);
		RegularPolygon tres = new RegularPolygon(10, 4);
		System.out.printf("Polygon 1 omkrets: %.2f\n",uno.getPerimeter());
		System.out.printf("Polygon 1 areal: %.2f\n", uno.getArea());
		System.out.printf("Polygon 2 omkrets: %.2f\n", dos.getPerimeter());
		System.out.printf("Polygon 2 areal: %.2f\n", dos.getArea());
		System.out.printf("Polygon 3 omkrets: %.2f\n	", tres.getPerimeter());
		System.out.printf("Polygon 3 areal: %.2f", tres.getArea());
	}

}

class RegularPolygon {
	private int sides;
	private double sideLength, x, y;
	
	public RegularPolygon() {
		sides = 3;
		sideLength = 1;
		x = y = 0;
	}
	
	public RegularPolygon(int sides, double sideLength) {
		this.sides = sides;
		this.sideLength = sideLength;
		x = y = 0;
	}
	
	public RegularPolygon(int sides, double sideLength, double x, double y) {
		this.sides = sides;
		this.sideLength = sideLength;
		this.x = x;
		this.y = y;
	}
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return sides*sideLength;
	}
	
	public double getArea() {
		return (sides*Math.pow(sideLength, 2))/(Math.tan(Math.PI/sides)*4);
	}
	
}