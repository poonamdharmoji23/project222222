package project2;

class parent3{
	int i;
	parent3(){
		
		System.out.println("from parent");
		
	}
}

class child3 extends parent3{
	int j;
	child3(){
		
		System.out.println("from child");
	}
}

class Example {
	public static void main(String[] args) {
		
		new child3();
	}

}
