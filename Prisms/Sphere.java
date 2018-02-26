
public class Sphere extends ThreeDShape {
	private double radius;
	public Sphere(double radius) {
		this.radius = radius;
	}

	public double calcAreaOfBase() {
		return 4 * Math.PI * radius * radius;
	}
	
	public  double calcPerimeter() {
		return (4/3) * Math.PI * radius * radius * radius;
	}
}
