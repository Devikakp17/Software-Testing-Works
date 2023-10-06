package basicss;
class animall
{
	public void animlfood()
	{
		System.out.println("animalfoood");
	}
}
class elephant extends animall
{
	public void elephants()
	{
		System.out.println("elephant");
	}
}
class tiger extends animall
{
	public void tiger()
	{
		System.out.println("tiger");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		
elephant ep=new elephant();
ep.elephants();
ep.animlfood();
tiger t=new tiger();
t.animlfood();
t.tiger();
	}

}
