package project2;

abstract class AbstarctBasicCalci {
	
	abstract int add(int a, int b);
	abstract int add(int p,int q,int r);
	abstract int sub(int x,int y);

}

class BasicCalci extends AbstarctBasicCalci{
	
	int add(int a,int b) {
		 return a+b;
		 }
	 int add(int p,int q,int r) {
		 return p+q+r;
	 }
	 int sub(int x,int y) {
		 return x-y;
	 }
}




	
	
	
