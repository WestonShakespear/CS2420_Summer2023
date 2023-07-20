public class wshakespear_Square extends wshakespear_Shape implements Comparable<wshakespear_Square>{

	private double sideLength;

	public wshakespear_Square( double _sideLength ) throws IllegalArgumentException {
		if (_sideLength < 0)
			throw new IllegalArgumentException();

		this.sideLength = _sideLength;
	}

	@Override
	public int compareTo(wshakespear_Square o) {
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
