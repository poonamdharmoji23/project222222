package project2;

public class Own {
	
	String degree;
	double totalmarks;
	
	Own(){
		
	}
	Own(String degree,double totalmarks){
		this.degree=degree;
		this.totalmarks=totalmarks;
	}
	public static Own create(String degree,double totalmarks) {
		Own o=new Own(degree,totalmarks);
		return o;
	}
	public Own displayOwn() {
		System.out.println("degree:"+" "+degree);
		System.out.println("totalmarks:"+" "+totalmarks);
		return this;
	}

}
