package uk.co.placona.algorithms.sorters;

import uk.co.placona.algorithms.utils.*;

/**
 * @author Marcos Placona
 * Purpose: To sort an array using insertion sort
 * Method:  Iterates, consuming one input element each repetition, and growing a sorted output list. On a repetition, insertion sort removes one 
 * 			element from the input data, finds the location it belongs within the sorted list, and inserts it there. 
 * 			It repeats until no input elements remain.
 * Visual:	http://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif
 */

public class InsertionSort extends Utils implements ISort {
	private int arr[];
	
	public InsertionSort(int arr[]) {
		super();
		this.arr = arr;
	}
	
	@Override
	public void sort() {
		int i, j, key;
		for(i = 1; i < arr.length; i++){
			key = arr[i];
			for(j = i - 1; j >= 0 && key < arr[j]; j--){
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
	}
}
