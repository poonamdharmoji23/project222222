package project2;

class Example3 {
	
	public static void main(String[] args) {
			
			// using static members of superclass using class name
			System.out.println(Subclass.i);
			Subclass.test();
			
			// try to access static members of super class
			// with the help of subclass object reference
			
			Subclass obj2=new Subclass();
			//parent class static member
			System.out.println(obj2.i);
			//parent class static method
			obj2.test();
		}
	}

