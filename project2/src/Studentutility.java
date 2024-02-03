class Studentutility {
	
	//1.calculating total marks
	public static double totalmarks(Student1 s) {
		double sum=0;
		for(int i=0;i<s.marks.length;i++) {
			sum=sum+s.marks[i];
		}
		return sum;
		
	}
	//2. displaying average marks
	public static double averagemarks(Student1 s) {
		
		double sum=0;
		for(int i=0;i<s.marks.length;i++) {
			sum=s.marks[i];
		}
		return sum/5;
		
	}
	//3.displaying max marks obtained
	public static double maxmarks(Student1 s) {
		 double max=s.marks[0];
		 for(int i=1;i<s.marks.length;i++) {
				if(s.marks[i]>max) {
					max=s.marks[i];
				}
			}
		 return max;
	}
	//4. displaying min marks
	public static double minmarks(Student1 s) {
		 double min=s.marks[0];
		 for(int i=1;i<s.marks.length;i++) {
				if(s.marks[i]<min) {
					min=s.marks[i];
				}
			}
		 return min;
	}
	

}
