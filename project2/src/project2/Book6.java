package project2;

class Book6 implements Comparable {
	
	double price;
	String title;
	
	Book6(){
		
	}
	Book6(double price,String title){
		this.price=price;
		this.title=title;
	}
	
	//override compareTo()
	
	public int compareTo(Object o) {
		
		Book6 t=(Book6)o;
		if(this.price==t.price)
			return 0;
		if(this.price>t.price)
			return 1;
		return -1;
	}

}
