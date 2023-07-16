
public class Square extends Shape implements Comparable<Square>{

	private double sideLength;

	public Square( double _sideLength ) throws IllegalArgumentException {
		if (_sideLength < 0)
			throw new IllegalArgumentException();

		this.sideLength = _sideLength;
	}

	@Override
	public int compareTo(Square o) {
		//Assume squares are differentiated by the length of their side
		//Compares this object with the specified object for order. Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object. 
		return (int)(this.sideLength - o.sideLength);
	}

	@Override
	public double area() {
		return this.sideLength * this.sideLength;
	}

	@Override
	public double perimeter() {
		return this.sideLength * 4;
	}


}
