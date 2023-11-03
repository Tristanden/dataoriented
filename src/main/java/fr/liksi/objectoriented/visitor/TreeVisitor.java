package fr.liksi.objectoriented.visitor;

public class TreeVisitor {

	public int visit(Node node) {
		return node.getLeft().accept(this) + node.getRight().accept(this);
	}

	public int visit(Leaf leaf) {
		return leaf.getValue();
	}
}
