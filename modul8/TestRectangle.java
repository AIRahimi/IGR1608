package modul8;

public class TestRectangle {
	
	public static void main (String[] args) {
		
		MyRectangle one = new MyRectangle(4, 40);
		MyRectangle two = new MyRectangle();
		two.setWidth(5.4);
		two.setHeight(6.3);
		
		System.out.println("Rektangel 1:");
		System.out.printf("Rektangel med sider: %4.2f og %.1f\n", one.getWidth(), one.getHeight());
		System.out.printf("Har arealen lik: %8.2f\n", one.getArea());
		System.out.printf("Og omkretsen lik: %7.2f\n", one.getPerimeter());
		System.out.println();
		System.out.println("Rektangel 2:");
		System.out.printf("Rektangel med sider: %4.2f og %.2f\n", two.getWidth(), two.getHeight());
		System.out.printf("Har arealen lik: %8.2f\n", two.getArea());
		System.out.printf("Og omkretsen lik: %7.2f", two.getPerimeter());
		
	}

}


class MyRectangle {
	private double width;
	private double height;
	
	public MyRectangle() {
		width = 1.0;
		height = 1.0;
	}
	
	public MyRectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public double getArea() {
		return height*width;
	}
	
	public double getPerimeter() {
		return 2*height + 2*width;
	}
}