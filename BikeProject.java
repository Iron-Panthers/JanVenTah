public class BikeProject
{
    public static void main(String[] args)
    {
        Wheels wheel1 = new Wheels(20.7, 4);
		System.out.println(wheel1);
		Brake brake1 = new Brake(2, 5.0);
		System.out.println(brake1);
		Gears gear1 = new Gears(10, true);
		System.out.println(gear1);
    }
}