package project2;

class Parent2 {
	
	static int a=10;
	static int b;
	static {
		a=20;
		b=30;
		System.out.println("Parent class is successfully loaded");
	}
	static void parentmethod() {
		System.out.println("Parent Method");
	}

}
