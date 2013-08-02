package uk.co.placona.algorithms.sorters;

import uk.co.placona.algorithms.utils.*;

/**
 * @author Marcos Placona
 * Purpose: To sort an array using Merge sort
 * Method:  Divides the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
 * 			Repeatedly merge sublists to produce new sublists until there is only 1 sublist remaining. This will be the sorted list.
 * Visual:	http://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif
 */

public class MergeSort extends Utils implements ISort {
	private int[] numbers;
	private int[] helperNumbers;
	private int number;
	
	public MergeSort(int arr[]){
		super();
		this.numbers = arr;
		number = arr.length;
		this.helperNumbers = new int[number];
	}

	@Override
	public void sort() {	
		mergesort(0, number -1);
	}

	private void mergesort(int low, int high) {
		if(low < high){
			// add up low and high and divide by two to get middle (int truncates it just how we want it)
			int middle = (low + high) / 2;
			
			// sort the left side of the array
			mergesort(low, middle);
			
			//and now sort the right side of the array
			mergesort(middle + 1, high);
			
			// all sorted, now let's merge
			merge(low, middle, high);
			
		}
		
	}

	private void merge(int low, int middle, int high) {
		// time to use our helper array create way above. We'll copy both parts into it
		for(int i = low; i <= high; i++){
			try{
				helperNumbers[i] = numbers[i];
			}
			catch( Exception e){
				e.printStackTrace();
			}
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		// let's copy the smallest values from either side back to the original array
		while(i <= middle && j <= high){
			// make a decision about which one is the smalles and copy it
			if(helperNumbers[i] <= helperNumbers[j]){
				numbers[k] = helperNumbers[i];
				i++;
			}
			else{
				numbers[k] = helperNumbers[j];
				j++;
			}
			k++;
		}
		// copy the remaining into the target array
		while(i <= middle){
			numbers[k] = helperNumbers[i];
			k++;
			i++;
		}
		
	}
	
}
