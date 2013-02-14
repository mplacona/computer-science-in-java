package sorters;

import utils.Utils;

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
