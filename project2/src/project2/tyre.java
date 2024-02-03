package project2;

class tyre {
	
	private String brand;
	
	//getter
	
	String getbrand() {
		
		return brand;
	}
	
	//setter
	
	void setbrand(String brand) {
		
		this.brand=brand;
	}
	
	tyre(String brand){
		setbrand(brand);
	}

}
