package project2;

public class Executive extends Manager {
	
	String stockoptions;
	
	Executive(int employeeid,int numberofsubordinates,String stockoptions){
		
		super(employeeid,numberofsubordinates);
		this.stockoptions=stockoptions;
		System.out.println("stockoptions :"+stockoptions);
	}
	

}
