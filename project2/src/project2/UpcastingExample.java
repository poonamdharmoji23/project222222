package project2;

class UpcastingExample {
	
	public static void main(String[] args) {
		
		Student3 s1=new Student3("Nikki",108);
		
		Person2 p=s1;
		System.out.println(p);
		System.out.println(s1);
		System.out.println(s1.name);
		System.out.println(s1.sid);
		System.out.println(p.name);
		System.out.println(p==s1);
		
	}
}
