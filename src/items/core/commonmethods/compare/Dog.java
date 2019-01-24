package items.core.commonmethods.compare;

import java.util.Comparator;

public class Dog implements Comparable<Dog>{

	int size;
	String name;
	
	@Override
	public int compareTo(Dog o) {
	
		if(this.size>o.size)
			return 1;
		else if(this.size==o.size)
			return 0;
		else
			return -1;
	}
	
	
	class DogSizeComparator implements Comparator<Dog>
	{

		@Override
		public int compare(Dog o1, Dog o2) {
			return Integer.compare(o1.size, o2.size);
			
		}
		
	}	

}
