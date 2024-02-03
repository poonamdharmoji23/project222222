package project2;

class Son extends Father {
	
	String name="Smith";
	void sondata() {
		System.out.println("Father name:"+ super.name);
		System.out.println("My name is :" + this.name);
	}

}
