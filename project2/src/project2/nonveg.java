package project2;

public class nonveg {
	
	String type;
	double price;
	String category;
	
	nonveg(){
		
	}
	nonveg(String type,double price,String category){
		this.type=type;
		this.price=price;
		this.category=category;
	}
	public static nonveg details(String type,double price,String category) {
		nonveg nv = new nonveg(type,price,category);
		return nv;
	}
	public nonveg display() {
		System.out.println("type:"+" "+type);
		System.out.println("price:"+" "+price);
		System.out.println("category:"+" "+category);
		return this;
	}
	

}
