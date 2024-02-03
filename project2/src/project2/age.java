package project2;

public class age {
	int age;
	String givendate;
	String dob;
	
	age(){
		
				
	}
	age(int age,String givendate,String dob){
		this.age=age;
		this.givendate=givendate;
		this.dob=dob;
	}
	public static age calculate(int age,String givendate,String dob) {
		age a = new age(age,givendate,dob);
		return a;
	}
	

}
