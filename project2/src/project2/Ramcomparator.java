package project2;

import java.util.Comparator;

class Ramcomparator implements Comparator {
	
	public int compare(Object o1,Object o2) {
		
		//downcast to laptop
		
		laptop1 l1=(laptop1)o1;
		laptop1 l2=(laptop1)o2;
		
		if(l1.ram==l2.ram)
			return 0;
		if(l1.ram>l2.ram)
			return 1;
		return -1;
	}

}
