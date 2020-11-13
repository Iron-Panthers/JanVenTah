

public class Wheels //start Wheels class
{
    private double wheelSize;
    private int numTires;
    public Wheels(double wheelSize, int numTires)//multi-arg constructor
    {
        this.wheelSize = wheelSize;
        this.numTires = numTires;
    }
    public String toString()
    {
        String wheelPrint = new String();
        wheelPrint = "The wheel size is " + wheelSize + " and there are " + numTires + " tires on the bike.";
        return wheelPrint;
    }
}
