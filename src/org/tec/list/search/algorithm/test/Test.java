package org.tec.list.search.algorithm.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.tec.list.search.algorithm.BinarySearch;

public class Test {

	@org.junit.jupiter.api.Test
	public void binarySearchTest() {
		BinarySearch<Integer> binary = new BinarySearch<>();
		ArrayList<Integer> array = new ArrayList<>();
		array.add(5);
		array.add(2);
		array.add(8);
		array.add(10);
		
		assertEquals(0,binary.isIn(array, 2));
		assertEquals(1,binary.isIn(array, 5));
		assertEquals(2,binary.isIn(array, 8));
		assertEquals(3,binary.isIn(array, 10));
	}

}
