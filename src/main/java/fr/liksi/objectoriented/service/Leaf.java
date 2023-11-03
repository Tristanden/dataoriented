package fr.liksi.objectoriented.service;

public class Leaf implements ITree {


	public Leaf(int value) {
		this.value = value;
	}

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
