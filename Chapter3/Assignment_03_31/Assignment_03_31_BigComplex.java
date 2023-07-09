import java.math.BigDecimal;
import java.util.Random;

public class Assignment_03_31_BigComplex {

	public BigDecimal real;
	public BigDecimal imaginary;
	
	public Assignment_03_31_BigComplex() {
		this.real = new BigDecimal(0);
		this.imaginary = new BigDecimal(0);
	}

	public Assignment_03_31_BigComplex(BigDecimal _real) {
		this.real = _real;
		this.imaginary = new BigDecimal(0);
	}
	public Assignment_03_31_BigComplex(BigDecimal _real, BigDecimal _imaginary) {
		this.real = _real;
		this.imaginary = _imaginary;
	}
	
	public Assignment_03_31_BigComplex(String s) {
		String[] parts = s.split(" \\+ ");

		if (parts.length == 1)
		{
			real = new BigDecimal(s);
			imaginary = new BigDecimal(0);
		} else {
			real = new BigDecimal(parts[0]);
			String imag = parts[1].replace("i", "");
			imaginary = new BigDecimal(imag);
		}
	}

	public static Assignment_03_31_BigComplex add(Assignment_03_31_BigComplex a, Assignment_03_31_BigComplex b) {
		BigDecimal real = a.real;
		real = real.add(b.real);

		BigDecimal imag = a.imaginary;
		imag = imag.add(b.imaginary);

		return new Assignment_03_31_BigComplex(real, imag);
	}
	
	public static Assignment_03_31_BigComplex subtract(Assignment_03_31_BigComplex a, Assignment_03_31_BigComplex b) {
		BigDecimal real = a.real;
		real = real.subtract(b.real);

		BigDecimal imag = a.imaginary;
		imag = imag.subtract(b.imaginary);

		return new Assignment_03_31_BigComplex(real, imag);
	}

	public boolean equals(Assignment_03_31_BigComplex a) {
		return (this.real.equals(a.real)) && (this.imaginary.equals(a.imaginary));
	}

	@Override
	public boolean equals(Object a) {
		if (!(a instanceof Assignment_03_31_BigComplex))
		{
			return false;
		}
		return equals((Assignment_03_31_BigComplex) a);
	}
	
	@Override
	public String toString() {
		String realStr = this.real.toString();
		String imagStr = this.imaginary.toString();

		String returnStr = "";

		if (imagStr.equals("0"))
		{
			returnStr = String.format("%s", realStr);
		}
		else
		{
			returnStr = String.format("%s + %si", realStr, imagStr);
		}

		return returnStr;
	}
	
	
}
