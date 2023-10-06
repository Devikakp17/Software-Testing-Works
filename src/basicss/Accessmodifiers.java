package basicss;
class Access
{
	private int value=13;
	
}
public class Accessmodifiers {
	private int a=10;
	private int b;

	public static void main(String[]args) {
	Access ob=new Access();
	Accessmodifiers ob1=new Accessmodifiers();
	{
		System.out.println(ob1.b=30);
	//System.out.println(ob.value());
	}

	}

}
