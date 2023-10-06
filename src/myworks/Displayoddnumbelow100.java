package myworks;

public class Displayoddnumbelow100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Displayoddnumbelow100 dw=new Displayoddnumbelow100() ;
		dw.display();}
		public void display()
		{
			int count=0;
		
for(int i=1;i<100;i++) {
	if(i%2!=0)
	{
		count++;
		
	}
	System.out.println(i);
}
		

	}

}
