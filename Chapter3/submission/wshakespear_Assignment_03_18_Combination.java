 public class wshakespear_Assignment_03_18_Combination {
    
    private int x;
    private int y;
    private int z;

    /**
     * This class represents a simple 3 digit code
     * @author Weston Shakespear
     * @param _x First digit
     * @param _y Second digit
     * @param _z Third digit
     **/
    public wshakespear_Assignment_03_18_Combination(int _x, int _y, int _z)
    {
        this.x = _x;
        this.y = _y;
        this.z = _z;
    }

    /**
     * Check to see if the provided code matches
     * @author Weston Shakespear
     * @param _x First digit
     * @param _y Second digit
     * @param _z Third digit
     * @return boolean Whether or not the code matches
     **/
    public boolean eval(int _x, int _y, int _z)
    {
        return (this.x == _x && this.y == _y && this.z == _z);
    }

}
