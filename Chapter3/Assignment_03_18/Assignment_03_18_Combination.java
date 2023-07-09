public class Assignment_03_18_Combination {
    
    private int x;
    private int y;
    private int z;

    public Assignment_03_18_Combination(int _x, int _y, int _z)
    {
        this.x = _x;
        this.y = _y;
        this.z = _z;
    }

    public boolean eval(int _x, int _y, int _z)
    {
        return (this.x == _x && this.y == _y && this.z == _z);
    }

}
