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
		//TODO 4.30 - get this working correctly
		//Assume circles are differentiated by their radius
		//Compares this object with the specified object for order. Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object. 
		
		return (int)(this.radius - o.radius);
	}
}
