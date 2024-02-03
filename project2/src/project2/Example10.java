package project2;

class Example10 {
	
	public static void main(String[] args) {
		
		rightangletriangle t1=new rightangletriangle(3,4);
		//help of t1 can i access area
		System.out.println(t1.area);
		// help of t1, can i access properties of triangle class
		System.out.println(t1.base);
		System.out.println(t1.height);
		// with the help of t1, can i invoke/access method of shape class
		t1.computearea();
		//with the help of t1, can i invoke/access method of triangle
		t1.display();
		
	}

}
