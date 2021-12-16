package minimum;

import java.util.Objects;

@SuppressWarnings("unused")
public class SetProject {

	private String name;
	private int num;

	public SetProject(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "SetProject [name=" + name + ", num=" + num + "]";
	}

}
