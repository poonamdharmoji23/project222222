package project2;

class Bird {
	String color;
	int lifespam;
	
	static {
		System.out.println("class bird is loaded");
	}
	public void birddetails() {
		System.out.println("color of the bird:"+color);
		System.out.println("lifespam of the bird:"+lifespam);
	}

}
