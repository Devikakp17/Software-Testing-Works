package basicss;

public class Abstract {

	public static void main(String[] args) {
		abstract class car
		{
			abstract public void Speedlimit();
			
				public void acceleration()
				{
					System.out.println("acceleration");
					
				}
				public class Kia extends car
				{

					@Override
					public void Speedlimit() {
						
						System.out.println("kia speedlimit");
					}
					
				}
				 
			
				
		}

	}

}
