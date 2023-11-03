package fr.liksi.objectoriented.direct;

public class Node implements ITree {

	private ITree left;

	private ITree right;

	public Node(ITree left, ITree right) {
		this.left = left;
		this.right = right;
	}
	public ITree getLeft() {
		return left;
	}

	public void setLeft(ITree left) {
		this.left = left;
	}

	public ITree getRight() {
		return right;
	}

	public void setRight(ITree right) {
		this.right = right;
	}

	@Override
	public int sum() {
		return this.getLeft().sum() + this.getRight().sum();
	}
}
