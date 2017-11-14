package org.tec.list.search.algorithm;

import java.util.ArrayList;
/* Clase de prueba, luego se quita*/

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(8);
		array.add(2);
		array.add(1);
		array.add(12);
		array.add(3);
		InterSearch<Integer> search = new InterSearch<>();
		System.out.println(search.isIn(array, 12));
	}

}
