package fr.liksi.dataoriented;

public class TreeHandler {
	public int sum(ITree tree) {
		return switch (tree) {
			case Node(var left, var right) -> sum(left) + sum(right);
			case Leaf(var value) -> value;
		};
	}
}
