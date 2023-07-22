import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
	
    private String name;
    private int age;
    private String address;
    private String phone;

    public Person( String n, int ag, String ad, String p ) {
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
	public int compareTo(Person o) {
		// TODO make this method work
		return 0;
	}

    /**
     * Return max item in a.
     * Precondition: a.length > 0
     */
	//Don't change this method
    public static Comparable findMax( Comparable [ ] a )
    {
        int maxIndex = 0;
        
        for( int i = 1; i < a.length; i++ )
            if( a[ i ].compareTo( a[ maxIndex ] ) > 0 )
                maxIndex = i;
            
        return a[ maxIndex ];    
    }
	
    
}
