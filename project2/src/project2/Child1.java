package project2;

class Child1 extends Parent2 {
	
	static int c;
	static int d=5;
	static {
		a=50;
		b=77;
		c=34;
		d=29;
		System.out.println("child class is successfully loaded");
	}
	static void childmethod() {
		System.out.println("child method");
	}

}
