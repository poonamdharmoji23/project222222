class Student1 {
	
	private String name;
	String Class;
	double marks[]= {56,87,90,76,89};
		
	
	//setter method
	public void setname(String name) {
		this.name=name;
		}
	//getter method
	public String getname() {
		return name;
	}
		
	Student1(String name,String Class){
		setname(name);
		System.out.println(Class);
		}

	public void displaymarks() {
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
	}
}
