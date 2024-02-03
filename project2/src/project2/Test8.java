package project2;

public class Test8 {
	
	public static void main(String[] args) {
		
		Person3 p=new Student03();//upcasting
		
		Student03 s= (Student03)p;//down casting explicitly
		
		System.out.println(s instanceof Person3);
		
		
		
	}

}
