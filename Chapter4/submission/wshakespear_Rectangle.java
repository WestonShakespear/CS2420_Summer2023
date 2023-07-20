public class wshakespear_Rectangle extends wshakespear_Shape {
	
    private double length;
    private double width;

    public wshakespear_Rectangle( double len, double wid ) throws IllegalArgumentException {
		if (len < 0 || wid < 0)
			throw new IllegalArgumentException();
            
        length = len; width = wid;
    }
     
    public double area( ) {
        return length * width;
    }
    
    public double perimeter( ) {
        return 2 * ( length + width );
    }
    
    public String toString( ) {
        return "Rectangle: " + length + " " + width;
    }
    
    public double getLength( ) {
        return length;
    }
    
    public double getWidth( ) {
        return width;
    }

}