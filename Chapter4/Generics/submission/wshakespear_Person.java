public class wshakespear_Person implements Comparable<wshakespear_Person> {
	
    private String name;
    private int age;
    private String address;
    private String phone;

    public wshakespear_Person( String n, int ag, String ad, String p ) {
        name = n; age = ag; address = ad; phone = p;
    }
    
    public String toString( ) {
        return getName( ) + " " + getAge( ) + " " + getPhoneNumber( );
    }
    
    public final String getName( ) {
        return name;
    }
    
    public final int getAge( ) {
        return age;
    }
    
    public final String getAddress( ) {
        return address;
    }
    
    public final String getPhoneNumber( ) {
        return phone;
    }
    
    public final void setAddress( String newAddress ) {
        address = newAddress;
    }
    
    public final void setPhoneNumber( String newPhone ) {
        phone = newPhone;
    }

	
	@Override
	public int compareTo(wshakespear_Person o)
    {
		return this.name.compareToIgnoreCase(o.name);
	}

    /**
     * Return max item in a.
     * Precondition: a.length > 0
     */
	//Don't change this method
    public static Comparable<wshakespear_Person> findMax( Comparable<wshakespear_Person> [ ] a )
    {
        int maxIndex = 0;
        
        for( int i = 1; i < a.length; i++ )
            if( a[ i ].compareTo( (wshakespear_Person)a[ maxIndex ] ) > 0 )
                maxIndex = i;
            
        return a[ maxIndex ];    
    }
	
    
}
