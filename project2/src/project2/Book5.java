package project2;

class Book5 implements Comparable {
	
	double price;
	String name;
	
	//override compareTo
	
	public int compareTo(Object o) {
		
		Book5 t=(Book5)o;
		
		if(this.price==t.price)
			return 0;
		if(this.price>t.price)
			return 1;
		return -1;
		
	}
}
