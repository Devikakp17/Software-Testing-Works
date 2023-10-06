package basicss;

public class Elseif {

	public static void main(String[] args) {
		int a=20,b=10,c=6;
		if(a>b&&a<c)
		{
			System.out.println("a is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}

}
