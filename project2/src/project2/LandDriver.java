package project2;

public class LandDriver {
	
	public static void main(String[] args) {
		
		Land l1 = Land.createproperties("Site", 25.75, "Revenue").displaydetails().matter("Survey", "Independant Pahani");
	    Land l2=l1;
	    System.out.println(l2);
	}

}
