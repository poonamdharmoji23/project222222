package project2;

class Dog extends Animal{
	
	String breed;
	
	Dog(){
		
	}
	Dog(String breed){
		this.breed=breed;
		System.out.println(breed);
	}
	public void bark() {
		System.out.println("bow..bow..bow......bow");
	}
}
