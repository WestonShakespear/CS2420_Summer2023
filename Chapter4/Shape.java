
public abstract class Shape {
	public abstract double area( );
	public abstract double perimeter( );

	public double originX;
	public double originY;

	public double semiperimeter( ) {
		return perimeter( ) / 2; 
	}

	public static double distance(Shape s1, Shape s2) {
		double x1 = s1.originX;
		double y1 = s1.originY;
		double x2 = s2.originX;
		double y2 = s2.originY;

		double distance = ((x2 - x1) * (x2 - x1));
		distance += ((y2 - y1) * (y2 - y1));

		return Math.sqrt(distance);
	}

	public void putShapeHere(double x, double y) {
		this.originX = x;
		this.originY = y;
	}

}
