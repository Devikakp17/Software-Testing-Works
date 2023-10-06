package basicss;
class member
{
	String nnme;
	String address;
	int phn;
	int salary;
	int age;
	public void printdetails()
	{
		System.out.println("name="+nnme);
		System.out.println("phonenum="+phn);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
		System.out.println("age="+age);
	}
}
class employee extends member
{
	String spl;
}
class manager extends member
{
	String dep;
	
}
public class Inheritanceprgm {

	public static void main(String[] args) {
		
employee ep=new employee();
ep.nnme="aaaa";
ep.address="bbbbb";
ep.phn=8677443;
ep.salary=9000;
ep.age=21;
ep.printdetails();
System.out.println(ep.spl="testing");
manager m=new manager();
System.out.println(m.dep="developing");



	}

}
