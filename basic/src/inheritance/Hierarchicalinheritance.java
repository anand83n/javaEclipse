package inheritance;

abstract class CSC {
	
	protected int eno;
	protected String name;
	abstract public void show();
	
}

class ADIP extends CSC
	
{ 
	ADIP(int e, String s) {


eno = e;
name = s;

	}
	
	public void show()
	
	{
		System.out.println("Course: ADIP");
		System.out.println("Enrollment number" + eno);
		System.out.println("Name" + name);
	}
}

class ECOM extends CSC 
{
	ECOM(int e, String s)
	
	{
		eno = e;
		name = s;
		
	}
	
	public void show()
	
	{
		System.out.println("Course: ECOM");
		System.out.println("Enrollment number" + eno);
		System.out.println("Name" + name);
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		
		CSC csc[] = new CSC[2];
		csc[0] = new ADIP(1001,"ramesh");
		csc[1] = new ECOM (1002,"divya");  
		csc[0].show();
		csc[1].show();
		
	

	}

}
