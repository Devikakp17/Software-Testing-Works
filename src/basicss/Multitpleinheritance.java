package basicss;
class animal
{
	public void animalFood()
	{
		System.out.println("AnimalFood");
	}
}
class dog extends animal
{
	public void barking()
	{
		System.out.println("dog");
	}
}
class babydog extends dog
{
	public void cry(){
		System.out.println("babydogcrying");
		
	}
}
public class Multitpleinheritance {

	public static void main(String[] args) {
		babydog bd=new babydog();
		bd.animalFood();
		bd.barking();bd.cry();

	}

}
