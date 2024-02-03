package project2;

class Student10 {
	
	private int sid;
	private String name;
	
	public int getsid() {
		return sid;
	}
	public void setsid(int sid) {
		this.sid=sid;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	Student10(){
		
	}
	
	Student10(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	
	//@override
	public String toString() {
		
		return "Student details [sid:"+this.sid+","+"Name:"+this.name+"]";
	}

}
