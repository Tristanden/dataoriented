package fr.liksi.objectoriented.direct;

public class Leaf implements ITree {
	private int value;

	public Leaf(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int sum() {
		return value;
	}
}
