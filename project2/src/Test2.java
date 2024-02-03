class Test2 {
	public static void main(String[] args) {
		Circle c1=new Circle(2);
		Circle c2=new Circle(3);
		
		// calculate diameter for c1 & c2
		System.out.println("diameter:" + Circles.ComputeDiameter(c1));
		System.out.println("diameter:" + Circles.ComputeDiameter(c2));
		
		// area of c1
		System.out.println("area:" + Circles.computearea(c1));
		
		// circumference of c2
		System.out.println("circum:" + Circles.computecircum(c2));
	}
}

