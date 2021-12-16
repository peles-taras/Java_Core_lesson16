package minimum;

import java.util.Comparator;

public class SetProjectComparator implements Comparator<SetProject>{

	@Override
	public int compare(SetProject o1, SetProject o2) {
		if(o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		}
		else if(o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		}
		else 
		return 0;
	}



}
