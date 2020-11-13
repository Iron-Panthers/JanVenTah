public class Gears 
{
    private int rings; 
    private boolean frontgears; 
    public Gears (int rings, boolean frontgears)
    {
      this.rings=rings;
      this.frontgears=frontgears; 
    }
    public String toString()
    {
      String gearPrint = new String();
      gearPrint = "There are " + rings + " rings in this bike. Are there front gears? " + frontgears;
      return gearPrint;
    }
}
    

