package org.tec.list.search.algorithm.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.tec.list.search.algorithm.BinarySearch;
import org.tec.list.search.algorithm.InterSearch;

class Test {
	
	public static ArrayList<Integer> array;
	public static ArrayList<String> stringArray;
	public static BinarySearch<Integer> binary = new BinarySearch<>();
	public static InterSearch<Integer> inter = new InterSearch<>();
	public static BinarySearch<String> binaryString = new BinarySearch<>();
	public static InterSearch<String> interString = new InterSearch<>();
	
	@org.junit.jupiter.api.BeforeAll
	public static void listDefine() {
		array = new ArrayList<>();
		array.add(5);
		array.add(2);
		array.add(8);
		array.add(10);
		array.add(0);
		array.add(4);
		
		stringArray = new ArrayList<>();
		stringArray.add("f");
		stringArray.add("a");
		stringArray.add("c");
		stringArray.add("z");
		stringArray.add("l");
	}

	@org.junit.jupiter.api.Test
	public void binarySearchIntTest() {
		assertEquals(0,binary.isIn(array, 0));
		assertEquals(1,binary.isIn(array, 2));
		assertEquals(4,binary.isIn(array, 8));
		assertEquals(5,binary.isIn(array, 10));
	}
	
	@org.junit.jupiter.api.Test
	public void binarySearchStringTest() {
		assertEquals(0,binaryString.isIn(stringArray, "a"));
		assertEquals(-1,binaryString.isIn(stringArray, "b"));
		assertEquals(4,binaryString.isIn(stringArray, "z"));
		assertEquals(3,binaryString.isIn(stringArray, "l"));
	}
	
	@org.junit.jupiter.api.Test
	public void interpolationintTest() {
		assertEquals(0,inter.isIn(array, 0));
		assertEquals(1,inter.isIn(array, 2));
		assertEquals(4,inter.isIn(array, 8));
		assertEquals(2,inter.isIn(array, 4));
	}
		
	@org.junit.jupiter.api.Test
	public void interpolationStringTest() {
		assertEquals(0,interString.isIn(stringArray, "a"));
		assertEquals(-1,interString.isIn(stringArray, "b"));
		assertEquals(4,interString.isIn(stringArray, "z"));
		assertEquals(3,interString.isIn(stringArray, "l"));
	}
}
