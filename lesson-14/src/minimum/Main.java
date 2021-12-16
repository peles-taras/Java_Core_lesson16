package minimum;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		HashSet<SetProject> hs = new HashSet<>();
		hs.add(new SetProject("name1", 11));
		hs.add(new SetProject("name2", 12));
		hs.add(new SetProject("name3", 13));
		hs.add(new SetProject("name4", 14));
		hs.add(new SetProject("name5", 15));

		System.out.println("Before sorting:");

		for (SetProject setProject : hs) {
			System.out.println(setProject);
		}

		System.out.println();
		System.out.println("After sorting:");

		TreeSet<SetProject> ts = new TreeSet<>(new SetProjectComparator());
		ts.add(new SetProject("name1", 11));
		ts.add(new SetProject("name2", 12));
		ts.add(new SetProject("name3", 13));
		ts.add(new SetProject("name4", 14));
		ts.add(new SetProject("name5", 15));

		for (SetProject setProject : ts) {
			System.out.println(setProject);
		}
	}

}
