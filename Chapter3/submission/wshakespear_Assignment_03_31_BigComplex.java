import java.math.BigDecimal;

public class wshakespear_Assignment_03_31_BigComplex {

	public BigDecimal real;
	public BigDecimal imaginary;
	
	/**
	 * This class provides operations for complex numbers, initially set at 0+0i
	 * @author Weston Shakespear
	 */
	public wshakespear_Assignment_03_31_BigComplex() {
		this.real = new BigDecimal(0);
		this.imaginary = new BigDecimal(0);
	}

	/**
	 * This class provides operations for complex numbers, with an initial complex part of 0i
	 * @author Weston Shakespear
	 * @param _real The real portion of the number
	 */
	public wshakespear_Assignment_03_31_BigComplex(BigDecimal _real) {
		this.real = _real;
		this.imaginary = new BigDecimal(0);
	}

	/**
	 * This class provides operations for complex numbers
	 * @author Weston Shakespear
	 * @param _real The real portion of the number
	 * @param _imaginary The complex portion of the number
	 */
	public wshakespear_Assignment_03_31_BigComplex(BigDecimal _real, BigDecimal _imaginary) {
		this.real = _real;
		this.imaginary = _imaginary;
	}
	
	/**
	 * This class provides operations for complex numbers, initilized from a string
	 * @author Weston Shakespear
	 * @param s The complex number in the form of "13 + 7i"
	 */
	public wshakespear_Assignment_03_31_BigComplex(String s) {
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

	/**
	 * This method allows adding two complex numbers by adding the parts
	 * @author Weston Shakespear
	 * @param a The first complex number
	 * @param b The second complex number
	 * @return BigComplex The result
	 */
	public static wshakespear_Assignment_03_31_BigComplex add(wshakespear_Assignment_03_31_BigComplex a, wshakespear_Assignment_03_31_BigComplex b) {
		BigDecimal real = a.real;
		real = real.add(b.real);

		BigDecimal imag = a.imaginary;
		imag = imag.add(b.imaginary);

		return new wshakespear_Assignment_03_31_BigComplex(real, imag);
	}
	
	/**
	 * This method allows subtracting two complex numbers by subtracting the parts
	 * @author Weston Shakespear
	 * @param a The first complex number
	 * @param b The second complex number
	 * @return BigComplex The result
	 */
	public static wshakespear_Assignment_03_31_BigComplex subtract(wshakespear_Assignment_03_31_BigComplex a, wshakespear_Assignment_03_31_BigComplex b) {
		BigDecimal real = a.real;
		real = real.subtract(b.real);

		BigDecimal imag = a.imaginary;
		imag = imag.subtract(b.imaginary);

		return new wshakespear_Assignment_03_31_BigComplex(real, imag);
	}

	/**
	 * Returns true if the two complex numbers are equal
	 * @author Weston Shakespear
	 * @param a An instance of the BigComplex class
	 * @return boolean Whether or not the value is equal to this
	 */
	public boolean equals(wshakespear_Assignment_03_31_BigComplex a) {
		return (this.real.equals(a.real)) && (this.imaginary.equals(a.imaginary));
	}

	/**
	 * Returns true if the two complex numbers are equal
	 * @author Weston Shakespear
	 * @param a An instance of the BigComplex class
	 * @return boolean Whether or not the value is equal to this
	 */
	@Override
	public boolean equals(Object a) {
		if (!(a instanceof wshakespear_Assignment_03_31_BigComplex))
		{
			return false;
		}
		return equals((wshakespear_Assignment_03_31_BigComplex) a);
	}
	
	/**
	 * Returns a string representation of the complex number
	 * @author Weston Shakespear
	 * @return String The value of the complex number as a string
	 */
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
