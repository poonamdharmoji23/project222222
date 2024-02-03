package project2;

class employee2 {
	
	String name;
	double salary;
	
	employee2(){
		
	}
	employee2(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	void employeedetails(String name,double salary){
		this.name=name;
		this.salary=salary;
		System.out.println("Name of the employee: "+name);
		System.out.println("Salary of the employee: "+salary);
	}

}
