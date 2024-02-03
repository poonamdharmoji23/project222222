class product {
	private double price ;
	// setter method
	void setPrice(double price) {
		// validation
		if(price>0) {
		// copy data from local to object
		this.price=price;
		}
	}
	
	//getter for price
	double getPrice() {
		return this.price;
	}
}
