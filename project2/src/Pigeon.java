public class Pigeon{
	String breed ;
	double age;
	public Pigeon(String breed , double age) {
		this.breed = breed ; 
		this.age = age ; 
	}
	public Pigeon() {
		
	}
	// task : display state of pegion 
	public void displayProperties() {
		System.out.println("Breed: " + breed);
		System.out.println("age: " + age );
	}
	
}