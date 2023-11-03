package fr.liksi.dataoriented;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeHandlerTest {

	@Test
	public void compute_tree_sum() {
		var test = new Node(new Leaf(5), new Node(new Leaf(1), new Leaf(4)));
		assertEquals(10, new TreeHandler().sum(test));

	}



}