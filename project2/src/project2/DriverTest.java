package project2;

public class DriverTest {
	
	public static void main(String[] args) {
		
		A9 a=new C9();
		//accessing members of C9
		System.out.println(((C9)a).k);
		
		B9 b=new E9();
		//accessing members of E9
		System.out.println(((E9)b).i);
		
		A9 a1=new B9();
		//accessing members of B9
		System.out.println(((B9)a).j);
		
	}

}
