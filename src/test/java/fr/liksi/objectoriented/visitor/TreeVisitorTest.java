package fr.liksi.objectoriented.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeVisitorTest {

	@Test
	void run_visitor() {
		var test = new Node(new Leaf(5), new Node(new Leaf(1), new Leaf(4)));
		var visitor = new TreeVisitor();
		assertEquals(10, test.accept(visitor));
	}
}