package fr.liksi.objectoriented.visitor;

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

	@Override
	public int accept(TreeVisitor treeVisitor) {
		return treeVisitor.visit(this);
	}
}
