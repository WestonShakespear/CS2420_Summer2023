import java.math.BigDecimal;
import java.util.Random;

public class Assignment_03_31_BigComplex {

	public BigDecimal real;
	public BigDecimal imaginary;
	
	/**
	 * This class provides operations for complex numbers, initially set at 0+0i
	 * @author Weston Shakespear
	 */
	public Assignment_03_31_BigComplex() {
		this.real = new BigDecimal(0);
		this.imaginary = new BigDecimal(0);
	}

	/**
	 * This class provides operations for complex numbers, with an initial complex part of 0i
	 * @author Weston Shakespear
	 * @param _real The real portion of the number
	 */
	public Assignment_03_31_BigComplex(BigDecimal _real) {
		this.real = _real;
		this.imaginary = new BigDecimal(0);
	}

	/**
	 * This class provides operations for complex numbers
	 * @author Weston Shakespear
	 * @param _real The real portion of the number
	 * @param _imaginary The complex portion of the number
	 */
	public Assignment_03_31_BigComplex(BigDecimal _real, BigDecimal _imaginary) {
		this.real = _real;
		this.imaginary = _imaginary;
	}
	
	/**
	 * This class provides operations for complex numbers, initilized from a string
	 * @author Weston Shakespear
	 * @param s The complex number in the form of "13 + 7i"
	 */
	public Assignment_03_31_BigComplex(String s) {
		// Split the real and complex string parts out
		String[] parts = s.split(" \\+ ");

		if (parts.length == 1)
		{
			// All we have is the real part
			real = new BigDecimal(s);
			imaginary = new BigDecimal(0);
		} else {
			// There is both a real and a complex part
			real = new BigDecimal(parts[0]);
			// Cleanup complex part
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
