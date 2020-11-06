

public class Wheels //start Wheels class
{
    private double wheelSize;
    private int numTires;
    public Wheels(double wheelSize, int numTires)//multi-arg constructor
    {
        this.wheelSize = wheelSize;
        this.numTires = numTires;
    }
    public Wheels()//zero-arg constructor
    {
        wheelSize = 19.6;
        numTires = 2;
    }
}
