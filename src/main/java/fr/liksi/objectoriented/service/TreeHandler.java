package fr.liksi.objectoriented.service;

public class TreeHandler {

	public int sum(ITree tree) {
		var sum = 0;
		if (tree instanceof Node) {
			var node = (Node) tree;
			sum = this.sum(node.getLeft()) + sum(node.getRight());
		} else if (tree instanceof Leaf) {
			var leaf = (Leaf) tree;
			sum = leaf.getValue();
		} else {
			throw new RuntimeException("Illegal data state");
		}
		return sum;
	}

}
