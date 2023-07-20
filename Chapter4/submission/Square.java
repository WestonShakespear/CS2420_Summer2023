public class Square extends Shape implements Comparable<Square>{

	private double sideLength;

	public Square( double _sideLength ) throws IllegalArgumentException {
		if (_sideLength < 0)
			throw new IllegalArgumentException();

		this.sideLength = _sideLength;
	}

	@Override
	public int compareTo(Square o) {
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
