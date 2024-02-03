package project2;

class Example110 {
	
	public static void main(String[] args) {
		
		triangle t1=new triangle(5,9);
		System.out.println(t1.area);
		t1.computearea();
		System.out.println(t1.base);
		System.out.println(t1.height);
		System.out.println("-------------------------------------");
		circle c1=new circle(25);
		System.out.println(c1.area);
		System.out.println(c1.radius);
		System.out.println("-------------------------------------");
		square s1=new square(5);
		System.out.println(s1.area);
		System.out.println(s1.side);
		
	}

}
