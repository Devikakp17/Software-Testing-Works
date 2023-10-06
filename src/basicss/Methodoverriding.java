package basicss;


		class p
		{
			public void phone() {
				System.out.println("samasung");
				
			}
			public void job()
			{
				System.out.println("Doctor");
			}
			
		}
		class Ch extends p
		{

			@Override
			public void phone() {
				
				System.out.println("iphone");
			}

			@Override
			public void job() {
				System.out.println("system engineer");
				
				
			}
			
		}
		
		public class Methodoverriding {

			public static void main(String[] args) {
				Ch c=new Ch();
				c.job();
				c.phone();
	}

}
