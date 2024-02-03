class Cargo {
	
	double cc;
	double bl;
	
	Cargo(double cc,double bl){
		this.cc=cc;
		this.bl=bl;
	}
		public static Cargo Create(double cc,double bl) {
			
			return new Cargo(cc,bl);
		}
	
}
