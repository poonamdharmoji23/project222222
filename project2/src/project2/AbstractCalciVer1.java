package project2;

abstract class AbstractCalciVer1 extends AbstarctBasicCalci{
	
	abstract int add(int a,int b);
	abstract int add(int p,int q,int r);
	abstract int sub(int x,int y);
	abstract double power(double i,double j);
}

class CalciVer1 extends AbstractCalciVer1{
	
	 int add(int a,int b) {
		 return a+b;
	 }
	 int add(int p,int q,int r) {
		 return p+q+r;
	 }
	 int sub(int x,int y) {
		 return x-y;
	 }
	 double power(double i,double j) {
		 return i/2*j/2;
	 }
}
