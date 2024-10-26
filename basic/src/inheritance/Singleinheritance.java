package inheritance;


class base
{
	void basemessage() {
		
		System.out.println("welcome to base class");
	}
	
}

class derive extends base {
	
	void derivemessage() {
		
		System.out.println("Welcome to derive class");
	}
}


 class Singleinheritance {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("how are you");

derive ob = new derive();
ob.derivemessage();
ob.basemessage();

	}

}
