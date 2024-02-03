// circles is a utility class
class Circles {
	
	//static methods to perform my tasks
	//1. to calculate diameter
	public static double ComputeDiameter(Circle c) {
		
		return 2*c.getradius();
	}
	
	//2. to calculate the area of circle, formula----->PI * radius * radius
	public static double computearea(Circle c) {
		return (22.0/7.0)*(c.getradius()*c.getradius());
		}
	//3.to calculate the circumference of the circle, formula------>2 * PI* radius
	public static double computecircum(Circle c) {
		return 2*(22.0/7.0)*c.getradius();
	}
}
