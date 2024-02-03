package project2;

class Student {
	
	private String name;
	String Class;
	 double marks[];
	
	//setter method
	 public void setname(String name) {
		 this.name=name;
		 
	 }
	 
	 //getter method
	 	 
	 public String getname() {
		 return name;
	 }
	 Student(String name,String Class,double marks[]){
		 this.name=name;
		 this.Class=Class;
		 this.marks[5]=marks[5];
	 }
	
	 public void displaymarks() {
		 System.out.println(marks[5]);		 
	 }
}
