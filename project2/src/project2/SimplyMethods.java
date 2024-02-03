package project2;

public class SimplyMethods {
	
	String name;
	int id;
	char intial;
	
	SimplyMethods(){
		
	}
	SimplyMethods(String name,int id,char intial){
		this.name=name;
		this.id=id;
		this.intial=intial;
	}
	
	public static SimplyMethods create(String name,int id,char intial) {
		SimplyMethods sm=new SimplyMethods(name,id,intial);
		return sm;
	}
	public SimplyMethods display() {
		System.out.println("name:"+" "+name);
		System.out.println("id:"+" "+id);
		System.out.println("intial:"+" "+intial);
		return this;
	}
	public SimplyMethods noln() {
		System.out.print(name+" "+id+" "+intial);
		return this;
	}

}
