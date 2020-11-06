public class Main 
{
	public static void main(String[] args) 
	{
		Wheels wheel1 = new Wheels();
		System.out.println(wheel1);
		Wheels wheel2 = new Wheels(20.7, 4);
		Brake brake1 = new Brake();
		System.out.println(brake1);
	}
}