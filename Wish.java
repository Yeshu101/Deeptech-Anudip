class Wish 
{
	static 
	{
		System.out.println("STATIC BLOCK");
	}
	Wish()
	{
		System.out.println("CONSTRUCTOR");
	}
	public static void display()
	{
		System.out.println("METHOD/NON-STATIC/INSTANCE");
	}
	public static void main(String[] ar)
	{

		System.out.println("Static method");
		new Wish();
		Wish.display();
	}
}
