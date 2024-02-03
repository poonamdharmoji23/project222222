package project2;

class E {
	
	static void demo() {
		
		System.out.println("from demo E class");
	}

}

class F extends E{
	
	public static void main(String[] args) {
		
		demo();
	}
}
