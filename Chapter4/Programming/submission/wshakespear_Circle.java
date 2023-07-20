public class wshakespear_Circle extends wshakespear_Shape implements Comparable<wshakespear_Circle> {
	
	private double radius;

	public wshakespear_Circle( double rad ) throws IllegalArgumentException {
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
	public int compareTo(wshakespear_Circle o) {
		// Return the difference between the input and this circle
		return (int)(this.radius - o.radius);
	}
}
