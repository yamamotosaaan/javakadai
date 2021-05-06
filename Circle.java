package java3kadai02;
import java3kadai02.Main;

public class Circle {
	
	private double area;
	private double circumference;
	private double inputradius;
	
	public static Circle create() {
		return new Circle();
	}
	
	public double getArea() {
		return area;
	}
	
	public double getInputradius() {
		return inputradius;
	}
	
	
	public static void Main(String[] args) {
		Main radius = new java3kadai02.Main();	
		area = (radius * 2 * Math.PI);
		//移動後の座標を表示
		System.out.println("円の面積は"+ area + "です。");

		
		
	}
	
}
