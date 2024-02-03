package project2;

class Student1 extends Person {
	
	public void displaystudentdata() {
		//name of the student
		//age of the student
		System.out.println(name);
		System.out.println(age);
		System.out.println("planet name:"+""+planet_name);
	}
	
	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		s1.displaystudentdata();
	}

}
