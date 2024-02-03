package project2;

class Test9 {

	public static void main(String[] args) {
		
		Person8 p=new Student8("nisha",9);
		//display name of the student
		System.out.println(p.name);
		
		//display sid
		//downcast using temp variable
		Student8 s=(Student8)p;
		System.out.println(s.sid);
		
		// downcasting and accessing without extra variable
		
		System.out.println(((Student8)p).sid);
		
		
	}
}
