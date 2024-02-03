package project2;

class Driver9 {
	
	public static void main(String[] args) {
		
		Clerk9 c1= new Clerk9("ruby",100000,"5page/hr");
		
		Employee9 e1=c1;
		System.out.println(e1==c1);
		
		System.out.println("Name of the clerk:"+c1.name);
		System.out.println("Salary of the clerk:"+c1.salary);
		
		Object o1=new Clerk9();
		System.out.println(o1==c1);
		
		System.out.println("Typing speed of the Clerk:"+c1.typingspeed);
		
	}

}
