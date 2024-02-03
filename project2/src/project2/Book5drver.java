package project2;

class Book5drver {
	
	public static void main(String[] args) {
		
		Book5 b1=new Book5();
		Book5 b2=new Book5();
		
		b1.price=100;
		b2.price=100;
		
		System.out.println(b1.compareTo(b2));//0
		
		b1.price=200;
		System.out.println(b1.compareTo(b2));//1
		
		b2.price=250;
		System.out.println(b1.compareTo(b2));//-1
		
	}

}
