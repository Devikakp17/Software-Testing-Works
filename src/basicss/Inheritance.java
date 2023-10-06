package basicss;


class parent
{
	public void job()
	{
		System.out.println("JOB DETAILS");
	}
}
class child extends parent
{
	public void tution()
	{
		System.out.println("TUTION");
	}
}
public class Inheritance {
	public static void main(String[] args) {
	child c=new child();
	c.job();
	c.tution();

	}

}
