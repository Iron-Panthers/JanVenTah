

public class Brake 
{
    private int pads;
    private double wheelCylinders;
    public Brake(int pads, double wheelCylinders)
    {
        this.pads=pads;
        this.wheelCylinders=wheelCylinders;
    }
    public String toString()
    {
        String brakePrint = new String();
        brakePrint = "There are " + pads + " pads and " + wheelCylinders + " wheel cylinders.";
        return brakePrint;
    }
}