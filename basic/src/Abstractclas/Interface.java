package Abstractclas;

import java.lang.classfile.Interfaces;

interface Interface 

{
	void print();
	
}

class A6 implements Interface

{
	
	public void print()

	{
		System.out.println("Hello");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 obj = new A6();
		
		obj.print();
		
		
		

	}

}
