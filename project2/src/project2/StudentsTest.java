package project2;

class StudentsTest {
	public static void main(String[] args) {
		Student s1=new Student("vijay","12th");
		Student s2=new Student("sheela","12th");
		System.out.println(s1.getname());
		System.out.println(s2.getname());
		s1.displaymarks();
		s2.displaymarks();
		}
}
