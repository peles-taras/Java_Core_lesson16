package maximum;

import java.util.Comparator;

public class ComparatorLength implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getLegth() - o2.getLegth();
	}

}
