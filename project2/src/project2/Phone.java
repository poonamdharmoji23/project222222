package project2;

public class Phone {
	
	int ram;
	int rom;
	
	Phone(int ram,int rom){
		
		this.ram=ram;
		this.rom=rom;
	}
	
	//override toString()
	public String toString() {
		// generate a string, which contains
		// state of the object
		return "Phone{ ram:"+ram+", rom :"+rom+"}";
	}

}
