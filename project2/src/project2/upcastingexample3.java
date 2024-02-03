package project2;

class upcastingexample3 {
	
	  public static void main(String[] args) {
		
		  EngStudent s1=new EngStudent();
		  
		  Student3 s2=new EngStudent();
		  
		  Person2 s3= new EngStudent();
		  
		  Object s4=new EngStudent();
	}
}
