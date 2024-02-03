package project2;

class Manager9 extends Employee9 {
	
	int numberofsubordinates;
	
	Manager9(){
		
	}
	Manager9(String name,double salary,int numberofsubordinates){
		super(name,salary);
		this.numberofsubordinates=numberofsubordinates;
	}

}
