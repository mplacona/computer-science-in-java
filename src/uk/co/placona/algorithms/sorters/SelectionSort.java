package uk.co.placona.algorithms.sorters;

import uk.co.placona.algorithms.utils.*;

/**
 * @author Marcos Placona
 * Purpose: To sort an array using Selection sort
 * Method:  Finds the minimum value, swaps it with the value in the first position and repeats this steps for the remainder of the list
 * Visual:	http://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif
 */
public class SelectionSort extends Utils implements ISort{
	private int arr[];
	
	public SelectionSort(int arr[]){
		super();
		this.arr = arr;
	}
	
	@Override
	public void sort() {
		int i,j,min;
		for(i = 0; i<arr.length; i++){
			// assume the first element is min
			min = i;
			for(j = i+1; j<arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}// got the minumum
			}
			// do the swaps
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
