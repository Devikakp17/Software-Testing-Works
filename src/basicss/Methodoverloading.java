package basicss;

public class  Methodoverloading{

	public static void main(String[] args) {
		Methodoverloading md=new Methodoverloading();
		md.add();
	md.add(2.5, 5);
	md.add(2, 8.9);
	md.add(22, 8);
		}
public void add()
{
	int a=10,b=20;
	int c =a+b;
	System.out.println("value="+c);
}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a,double b)
{
	double c=a+b;
	System.out.println(c);
	
}
public void add(double a,int b)
{
	double c=a+b;
	System.out.println(c);
}
}
