package fr.liksi.objectoriented.direct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ITreeTest {

	@Test
	public void compute_tree_sum() {
		var test = new Node(new Leaf(5), new Node(new Leaf(1), new Leaf(4)));
		assertEquals(10, test.sum());
	}
}