package project2;

class upcastingexample2 {
	
	public static void main(String[] args) {
		
		Student3 s1=new Student3();
		
		Person2 p=s1;
		
		Person2 p1=new Student3();// implicit upcasting (Person2) new Student();
		
		Person2 p2=(Person2) new Student3(); // explicit upcasting
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
