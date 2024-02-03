package project2;

class Manager extends Employee1 {
	
	int numberofsubordinates;
	
	Manager(){
		
	}
	
	Manager(int employeeid,int numberofsubordinates ){
		this.employeeid=employeeid;
		this.numberofsubordinates=numberofsubordinates;
	}
	
	public void display() {
		System.out.println("empid :"+employeeid);
		System.out.println("numberofsubordinates :"+numberofsubordinates);
	}

}
