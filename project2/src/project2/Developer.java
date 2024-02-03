package project2;

class Developer extends Employee {
	
	String githublink;
	
	public void link(String githublink) {
		this.githublink=githublink;
		System.out.println(githublink);
	}
	
	public static void main(String[] args) {
		
		Developer d1=new Developer();
		d1.link("link in progress");
		
	}
	

}
