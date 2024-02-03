package project2;

abstract class AbstractCalciVer2 extends AbstarctBasicCalci{
	
	abstract int add(int a,int b);
	abstract int add(int p,int q,int r);
	abstract int sub(int x,int y);
	abstract double square(double s);
	abstract double cube(double c);
		
}

class CalciVer2 extends AbstractCalciVer2{
	
	int add(int a,int b) {
		 return a+b;
	 }
	 int add(int p,int q,int r) {
		 return p+q+r;
	 }
	 int sub(int x,int y) {
		 return x-y;
	 }
	 double square(double s) {
		 return s*s;
	 }
	 double cube(double c) {
		 return c*c*c;
	 }
}