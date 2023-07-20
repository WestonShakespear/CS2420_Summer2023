public class Circle extends Shape implements Comparable<Circle> {
	
	private double radius;

	public Circle( double rad ) throws IllegalArgumentException {
		if (rad < 0)
			throw new IllegalArgumentException();

		radius = rad;
	}

	public double area( ) {
		return Math.PI * radius * radius;
	}

	public double perimeter( ) {
		return 2 * Math.PI * radius;
	}

	public String toString( ) {
		return "Circle: " + radius;
	}

	@Override
	public int compareTo(Circle o) {
		// Return the difference between the input and this circle
		return (int)(this.radius - o.radius);
	}
}
