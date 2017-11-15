package org.tec.list.search.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class InterSearch <T extends Comparable<T>> {
	
	private int medium;

	public int isIn (ArrayList<T> array, T valor) {
		Collections.sort(array);

		int min = 0;
		int max = array.size()-1;
		if (search(array,valor,max,min)) {
			return medium;
		} else {
			return -1;
		}

	}

	private boolean search(ArrayList<T> array, T valor, int max, int min) {

		int medium = min+(((valor.hashCode()-array.get(min).hashCode())*(max-min)))/
				(array.get(max).hashCode()-array.get(min).hashCode());

		if (array.get(medium).compareTo(valor) == 0) {
			this.medium = medium;
			return true;
		} else if (max == min || min>max) {
			return false;
		} else {
			if (array.get(medium).compareTo(valor) > 0) {
				max = medium-1;
				return search(array,valor,max,min);
			} else {
				min = medium+1;
				return search(array,valor,max,min);
			}
		}
	}

}
