package sorters;

import utils.Utils;

/**
 * @author Marcos Placona
 * Purpose: To sort an array using Merge sort
 * Method:  Divides the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
 * 			Repeatedly merge sublists to produce new sublists until there is only 1 sublist remaining. This will be the sorted list.
 * Visual:	http://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif
 */

public class MergeSort extends Utils implements ISort {
	private int arr[];
	
	public static void main(String[] args) {
		MergeSort merge = new MergeSort(arrNumbers);
		merge.sort();
	}
	
	public MergeSort(int[] arr) {
		super();
		this.arr = arr;
	}
	
	@Override
	public void sort() {
		merge_sort(arr);
	}
	
	private int[] merge_sort(int[] arr){
		if(arr.length == 1){
			return arr;
		}
		else{
			int n = (int) Math.floor(arr.length/2);
			int B[] = new int[n];
			int C[] = new int [arr.length-n];
			int i;
			for(i = 0; i < arr.length; ++i){
				//divide the array into the two sub-arrays
				if(i<n){
					B[i] = arr[i];
				}
				else{
					C[i-n] = arr[i];
				}
			}
			B = merge_sort(B);
			C = merge_sort(C);
			//print(B);
			//print(C);
			return arr;
		}
	}
}
