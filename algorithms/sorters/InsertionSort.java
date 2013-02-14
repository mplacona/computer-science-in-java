package sorters;

import utils.Utils;

public class InsertionSort extends Utils implements ISort {
	private int arr[];
	public static void main(String[] args) {
		InsertionSort insertion = new InsertionSort(arrNumbers);
		insertion.sort();
		print(arrNumbers);		
	}
	
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
