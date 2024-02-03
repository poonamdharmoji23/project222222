package project2;

public class Land {
	
	String type;
	double acres;
	String department;
	
		
	Land(){
		
	}
	Land(String type,double acres,String department){
		this.type=type;
		this.acres=acres;
		this.department=department;
	}
	public static Land createproperties(String type,double acres,String department) {
		Land l=new Land(type,acres,department);
		return l;
	}
	public Land displaydetails() {
		System.out.println("type---->"+" "+type);
		System.out.println("acres--->"+" "+acres);
		System.out.println("department---->"+" "+department);
		return this;
	}
	public Land matter(String conclusion,String Solution) {
		System.out.println("conclusion:"+" "+conclusion);
		System.out.println("Solution:"+" "+Solution);
		return this;
	}
	
}
